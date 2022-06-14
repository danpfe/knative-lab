# KNative Demo

Simple example that shows how KNative Serving and KNative Eventing can be used together to start services on demand and scale them back to
zero. Furthermore simple request routing and Kafka for reliable message storage is shown for completeness.

## Components

* A simple Java application that can deal with an incoming CloudEvent-message and sums a bunch of incoming numbers.
* A KNative Broker that uses Kafka as message storage backend.
* Two Event Sources that will at a given interval send invalid and valid events to the broker.
* Three KNative Services that scale the different applications.
* Triggers that filter events based on their CloudEvent-type and route them to the KNative Services.
* A simple build-setup for the Java application

## How to use

Simply do a `oc apply -f resources.yaml` and build the `calcfunc`-image using `oc start-build calcfunc`. Then look at how the pods are
coming up and check their results.

