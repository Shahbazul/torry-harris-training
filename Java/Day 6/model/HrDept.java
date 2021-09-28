package com.torryharris.model;


import com.torryharris.exception.ClLimitExceedeException;
import com.torryharris.exception.InvalideCLRequestException;

public class HrDept  {
    public void requestCL(Employee emp, int noOfDays) throws InvalideCLRequestException, ClLimitExceedeException {
        if (noOfDays>3){
        throw new InvalideCLRequestException("Your leave days exceeds");
    }
   else if(emp.getBalanceCL()<1){
       throw new ClLimitExceedeException("This");
        }
   else
        {
            System.out.println("Approved");
            System.out.println(emp.getBalanceCL(emp.getname()+emp.getBalanceCL()));
            System.out.println();
        }
    }
}
