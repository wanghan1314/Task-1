<%@ page contentType="text/html; charset=gb2312"%>

<script language="JavaScript">
    function isValidate(form){
        //�õ��û�������û���������
        userid=form.userid.value;
        userpass=form.userpass.value;

        //����������֤�û���
        //����û����ĳ���С����
        if(userid.length<6){
            alert("�û����ĳ���С������");
            form.userid.focus();
            return false;
        }

        //����û����ĳ��ȴ���8
        if(userid.length>8){
            alert("�û����ĳ��ȴ��ڰˡ�");
            form.userid.focus();
            return false;
        }

        //��������֤����
        //�������ĳ���С����
        if(userpass.length<6){
            alert("����ĳ���С������");
            form.userpass.focus();
            return false;
        }

        //�������ĳ��ȴ���8
        if(userpass.length>8){
            alert("����ĳ��ȴ��ڰˡ�");
            form.userpass.focus();
            return false;
        }

        //�������û����������
        if(userpass==userid){
            alert("�������û����������");
            form.userpass.focus;
            return false;
        }

    }
</script>
<html>
<head>
    <title>��¼����</title>
</head>
<body>
<h2 align="center">��¼����</h2>
<form name=form1 action="/task2/login" method="post" onsubmit="return isValidate(form1)">
    <table align="center">
        <tr>
            <td>�û�ID��</td>
            <td><input type="text" name="userid" >6~8λ</td>
        </tr>
        <tr>
            <td>���</td>
            <td><input type="password" name="userpass" >6~8λ���Ҳ������û�ID��ͬ</td>
        </tr>

        <tr>
            <td><input type="reset" value="����"></td>
            <td><input type="submit" value="ȷ��"></td>
        </tr>
    </table>
</form>
</body>
</html>