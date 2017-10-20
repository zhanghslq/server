package com.yb.advice;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yb.dao.PosIpDao;
import com.yb.entity.PosIp;
import com.yb.entity.Status;
import com.yb.util.AddrUtil;
import com.yb.util.DynamicDataSourceHolder;


/**
 * 自定义的通知类  
 * 作用:用来记录业务方法的运行时长
 * @author Administrator
 *
 */
@Component("recordServiceTimeAdvice")
public class RecordServiceTimeAdvice implements MethodInterceptor{
	@Autowired
	private PosIpDao posIpDao;
	/**
	 * 环绕通知来判断调用者的IP是否合法，不合法的话，就中断请求，不再继续，可以的话，就继续
	 * 参数: invocation  
	 * 返回值: 当前目标方法的返回值 
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] arguments = invocation.getArguments();
		if(arguments[0] instanceof HttpServletRequest){
			HttpServletRequest request=(HttpServletRequest)arguments[0];
			String addr1 = AddrUtil.getIpAddr1(request);
			DynamicDataSourceHolder.putDataSourceKey("result");//改变数据源
			PosIp queryByPosIp = posIpDao.queryByPosIp(addr1);
			System.out.println(addr1);
			if(queryByPosIp==null||queryByPosIp.getId()==null){
				return new Status("error", "您的地址非法，请不要捣乱");
			}
			Object proceed = invocation.proceed();
			return proceed;
		}
		return new Status("error", "系统出错，请联系相关人员");
	}
}
