//�������ǵ�һ��Js������


function changeStatus(obj){
	if(obj.value=='worker'){
		$(".gra_spe").css("display","none");//���ش�ѧ����ѡ������
		$(".worker_sep").css("display","block"); //��ʾ���ѹ�����ѡ������
	}else if(obj.value=='graduate'){
		$(".gra_spe").css("display","block");
		$(".worker_sep").css("display","none");
	}
				
}


