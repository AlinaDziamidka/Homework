package com.itacademy.brest.companyTask.staff;

import com.itacademy.brest.companyTask.report.ReportFactory;
import com.itacademy.brest.companyTask.report.Reportable;
import com.itacademy.brest.companyTask.staffAtributes.People;
import com.itacademy.brest.companyTask.staffAtributes.Title;

public class Head extends Staff {

    private ReportFactory reportFactory;

    double getSalaryRate() {
        return 3;
    }

    public Head(People people, Title title) {
        super(people, Title.HEAD);
    }

  public String getReport (Title title){
      return reportFactory.getReport(title);
    }


//    @Override
//    public Object getReport(Object title) {
//        String report = null;
//        try {
//            if (title == Title.ACCOUNTANT) {
//                for (int i = 0; i < getCompany().getStaffList().size(); i++) {
//                    try {
//                        if (title.equals(getCompany().getStaffList().get(i).getTitle()) && ((Accountant) getCompany().getStaffList().get(i)).getStatus().equals(Accountant.Status.HEAD_OF_DEPARTMENT)) {
//                            report = ((Accountant) getCompany().getStaffList().get(i)).getSalaryReport().toString();
//                        }
//                    } catch (Exception e) {
//                        System.out.println("/not found head of department");
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("/not accountant");
//        }
//        return report;
//    }
}
