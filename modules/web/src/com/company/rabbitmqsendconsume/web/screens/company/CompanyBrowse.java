package com.company.rabbitmqsendconsume.web.screens.company;

import com.company.rabbitmqsendconsume.entity.Company;
import com.company.rabbitmqsendconsume.service.RabbitmqService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("rabbitmqsendconsume_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {

    @Inject
    private Notifications notifications;

    @Inject
    private RabbitmqService RabbitmqService;
    @Inject
    private GroupTable<Company> companiesTable;

    @Subscribe("sendToMQ")
    public void onSendToMQClick(Button.ClickEvent event) {
        publishMessageToMQ(companiesTable.getSingleSelected());
    }

//    @Subscribe
//    public void onBeforeCommitChanges(MasterDetailScreen.BeforeCommitChangesEvent event) {
//        publishMessageToMQ(getEditedEntity());
//    }
//
//    @EventListener
//    protected void onAgencyCreated(AgencyCreationEvent event) {
//        createTrayNotification(event.getMessage());
//    }

    private void publishMessageToMQ(Company Company) {
        String result = RabbitmqService.send(Company);

        createTrayNotification(result);
    }

    private void createTrayNotification(String message) {
        notifications
                .create()
                .withType(Notifications.NotificationType.TRAY)
                .withCaption("The Rabbit is notified with "+message)
                .show();
    }
}