package com.company.rabbitmqsendconsume.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.rabbitmqsendconsume.entity.Company;

@UiController("rabbitmqsendconsume_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}