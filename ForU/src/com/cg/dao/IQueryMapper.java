package com.cg.dao;

public interface IQueryMapper {
public static final String INSERT_QUERY=""
		+ "INSERT INTO Employee1 values(emp_seq.nextval,?,?,?,?)";

public static final String GET_CURRENT_ID="SELECT emp_seq.currval FROM dual";
}