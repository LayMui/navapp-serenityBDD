#!/bin/bash

display_usage() {
  echo "This script must be run with at least 2 arguments"
  echo -e "Usage:" $0 "[iOS|android]"
}

if [  $# -lt 1 ]
then
      display_usage
      exit 1
fi

mvn -U -DskipTests=true clean install
case $1 in 
  iOS_realdevice)
    mvn clean verify -Dwebdriver.driver=appium -Dcucumber.filter.tags="@mobile" -Dproperties=serenity.ios.real.devices.properties
    ;;
  iOS)
    mvn clean verify -Dwebdriver.driver=appium -Dcucumber.filter.tags="@test" -Dcucumber.glue="demo.stepdefinitions" -Dproperties=serenity.ios.properties
    ;;
  android_realdevice|android)
    mvn clean verify -Dwebdriver.driver=appium -Dcucumber.filter.tags="@test" -Dcucumber.glue="demo.stepdefinitions" -Dproperties=serenity.android.properties
    ;;
  # android)
  #   mvn clean verify -Dwebdriver.driver=appium -Dcucumber.filter.tags="@test" -Dcucumber.glue="demo.stepdefinitions"
  #   ;;
  *)
    display_usage
    exit 1
    ;;
esac