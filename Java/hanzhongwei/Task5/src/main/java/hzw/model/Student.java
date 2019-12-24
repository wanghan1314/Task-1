package hzw.model;

/**
 * 学员 :
 */
public class Student {
    private Long stuId;
    private String stuName;
    private String stuIntroduction;
    private Integer stuWork;
    private Integer stuSuper;
    private String stuProfession;
    private Long create_at;
    private Long update_at;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuIntroduction() {
        return stuIntroduction;
    }

    public void setStuIntroduction(String stuIntroduction) {
        this.stuIntroduction = stuIntroduction;
    }

    public Integer getStuWork() {
        return stuWork;
    }

    public void setStuWork(Integer stuWork) {
        this.stuWork = stuWork;
    }

    public Integer getStuSuper() {
        return stuSuper;
    }

    public void setStuSuper(Integer stuSuper) {
        this.stuSuper = stuSuper;
    }

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }

    public String getStuProfession() {
        return stuProfession;
    }

    public void setStuProfession(String stuProfession) {
        this.stuProfession = stuProfession;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuIntroduction='" + stuIntroduction + '\'' +
                ", isWork=" + stuWork +
                ", isSuper=" + stuSuper +
                ", stuProfession='" + stuProfession + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }
}
