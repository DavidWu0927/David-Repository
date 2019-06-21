package cn.bdqn.whcm.pojo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	@NotNull(message="学号不能为空！")
    private Integer sno;
	
	@Length(max=5,min=1,message="姓名长度必须是1-5位！")
    private String sname;
	
    private Integer cid;

    private Integer sresult;

    
    private Integer age;

    @NotEmpty(message="地址不能为空！")
    private String address;

    @Past
    private Date bornDate;
    
    @Pattern(regexp="/^[a-z\\d]+(\\.[a-z\\d]+)*@([\\da-z](-[\\da-z])?)+(\\.{1,2}[a-z]+)+$/")
    private String email;
    
    public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSresult() {
        return sresult;
    }

    public void setSresult(Integer sresult) {
        this.sresult = sresult;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", cid=" + cid + ", sresult=" + sresult + ", age=" + age
				+ ", address=" + address + ", bornDate=" + bornDate + ", email=" + email + "]";
	}



    
}