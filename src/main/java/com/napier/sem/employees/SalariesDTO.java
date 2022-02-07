package com.napier.sem.employees;

public class SalariesDTO {
    private Integer empNo;
    private Integer salary;
    private java.sql.Date fromDate;
    private java.sql.Date toDate;

    public Integer getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public java.sql.Date getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(java.sql.Date fromDate) {
        this.fromDate = fromDate;
    }

    public java.sql.Date getToDate() {
        return this.toDate;
    }

    public void setToDate(java.sql.Date toDate) {
        this.toDate = toDate;
    }
}
