package pl.pawelrochala.interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Map;
import pl.pawelrochala.users.User;

import pl.pawelrochala.actions.flow.SessionKeys;

public class AuthenticationInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session = actionInvocation.getInvocationContext().getSession();
		User user = (User) session.get(SessionKeys.USER);
		if (user == null) {
			
			return Action.LOGIN;
		}
		return actionInvocation.invoke();

	}

}
