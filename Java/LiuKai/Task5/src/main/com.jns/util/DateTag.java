package util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTag extends TagSupport {
    private static final long serialVersionUID = 6464168398214506236L;
    private String value;
    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public int doStartTag() throws JspException {
        String vv = "" + value;
        try {
            long time = Long.valueOf(vv.trim());
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(time);
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
            String s = dateformat.format(c.getTime());
            pageContext.getOut().write(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.doStartTag();
    }


}
