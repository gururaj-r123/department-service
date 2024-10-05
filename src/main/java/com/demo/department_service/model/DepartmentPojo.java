package com.demo.department_service.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class DepartmentPojo {
	private long deptId;
	private String deptName;
	private List<EmployeePojo> allEmployees;

	public DepartmentPojo(long deptId, String deptName, List<EmployeePojo> allEmployees) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.allEmployees = allEmployees;
	}

	public DepartmentPojo() {
	}

	public void setAllEmployees(List<EmployeePojo> allEmps) {
		this.allEmployees=allEmps;
    }
}
