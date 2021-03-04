package com.rafsoft;

public interface Subject {
    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    void notifySubscribers();
}
