package pl.pawelrochala.interceptors;

import java.util.Map;

import pl.pawelrochala.actions.flow.SessionKeys;
import pl.pawelrochala.users.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor {

	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	


	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session = actionInvocation.getInvocationContext().getSession();
		User user = (User) session.get(SessionKeys.USER);
		if (user == null) {
			actionInvocation.getInvocationContext().getSession();
			return Action.LOGIN;
		}
		if(user.getIsAdmin()){
			return actionInvocation.invoke();
		}
		return ActionResults.PERMISSION_DENY; 	
		}

}
