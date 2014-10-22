
## General

Speech recognition apps are a collection of pre-configure fabric8 profiles. An app belongs to one of four main categories:

  * input
  * feature
  * decoder
  * evaluator

This is not mandatory one may define sub-categories or even greater by having all parts in one big app. The aim generally is to use/configure every part independenly and put it together with other apps in a sequence

    input --> frond-end --> decoder --> evaluator

Every app is configured using Spring application context (DI) and Apache Camel (EIPs) for service integration provided by Sphinx4soc library. The idea is to provide an enviroment highly scalable and simple to perform speech recognition accuracy assessments.

## Input Apps

Currently are two App profile examples:

 * [input-file](input-file/index.html)
 * [input-mongodb](input-mongodb/index.html)

## Feature Apps

  * [feature-mfcc](feature-mfcc/index.html)

## Decoder Apps

  * [decoder-default](decoder-default/index.html)


