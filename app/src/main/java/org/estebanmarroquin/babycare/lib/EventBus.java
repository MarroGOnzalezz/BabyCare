package org.estebanmarroquin.babycare.lib;

/**
 * Created by pc on 19/06/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
