/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.xiaonei.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import com.xiaonei.domain.Users;
import com.xiaonei.web.form.UserForm;

/** 
 * MyEclipse Struts
 * Creation date: 10-17-2016
 * 
 * XDoclet definition:
 * @struts.action parameter="flag"
 */
public class ProfileAction extends DispatchAction {
	
	//跳转到个人主页
	public ActionForward goHomePageUI(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		return mapping.findForward("goHomePageUI");
	}
	
	
	//跳转到上传头像的页面
	public ActionForward uploadPhotoUI(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		return mapping.findForward("goUploadPhotoUI");
	}
	
	//上传一个头像
	public ActionForward uploadPhoto(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm userForm = (UserForm)form;
		FormFile myPhoto = userForm.getMyphoto();
		//得到当前用户[从session]
		Users loginUser = (Users) request.getSession().getAttribute("loginuser");
		//修改用户的头像图片
		System.out.println(myPhoto.getFileName());
//		loginUser.setPhoto();
		return mapping.findForward("goUploadPhotoUI");
	}
	
}