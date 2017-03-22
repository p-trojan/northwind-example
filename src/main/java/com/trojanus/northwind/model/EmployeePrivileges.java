package com.trojanus.northwind.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by John on 3/22/2017.
 */
@Entity
@Table(name = "employee_privileges")
public class EmployeePrivileges {

    private int employeeId;
    private int privilegeId;

    public EmployeePrivileges() {}

    public EmployeePrivileges(int employeeId, int privilegeId) {
        this.employeeId = employeeId;
        this.privilegeId = privilegeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public String toString() {
        return "EmployeePrivileges{" +
                "employeeId=" + employeeId +
                ", privilegeId=" + privilegeId +
                '}';
    }
}
