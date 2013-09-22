package org.devunited.grails.plugin.recurly.enums

public enum WebHookResponseType {
    SUCCESSFUL_PAYMENT_NOTIFICATION("Successful Payment"),
    FAILED_RENEWAL_PAYMENT_NOTIFICATION("Failed Renewal"),
    SUBSCRIPTION_UPDATED("Subscription updated"),
    EXPIRED_SUBSCRIPTION_NOTIFICATION("Expired Notification"),
    CANCELED_SUBSCRIPTION_NOTIFICATION("Canceled Notification"),
    RENEWED_SUBSCRIPTION_NOTIFICATION("Renewed Notification"),
    NEW_SUBSCRIPTION_NOTIFICATION("New Subscription Notification")

    String value

    WebHookResponseType(String value) {
        this.value = value
    }

    public String toString() {
        return value
    }
}
