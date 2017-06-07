package com.xiaonei.web.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.xiaonei.service.TestService;

public class TestAction extends DispatchAction {
	
	private TestService testService;	
	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public ActionForward test(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		List list = testService.showCountry();
		request.setAttribute("list", list);
		return mapping.findForward("show");
	}
}


