#!/bin/bash

# where you will unzip build
BUILD_LOC="/opt/users/hudsonbuild/.hudson/jobs/cbi-amalgam-nightly/workspace/unzipped"

# where you will have your promotion logs
PROMO_LOGS_DIR="/home/data/users/cbrun/promo_logs"

# where is your releng job, ie /opt/users/hudsonbuild/.hudson/jobs/cbi-emf-eef-0.7-nightly/workspace/build/org.eclipse.eef.releng
RELENG_DIR="/opt/users/hudsonbuild/.hudson/jobs/cbi-amalgam-nightly/workspace/build/org.eclipse.amalgam.releng"

# this script log
logFile=""

# Ant installation
ANT="/opt/public/common/apache-ant-1.7.1/bin/ant"

rm -f $logFile
echo "[`date +%Y/%m/%d\ %H:%M`]: getting last successful build" >> $logFile
mkdir -p $BUILD_LOC
rm -f $BUILD_LOC/build.zip
rm -rf $BUILD_LOC/build
cd $BUILD_LOC
wget --no-check-certificate "https://build.eclipse.org/hudson/job/cbi-amalgam-nightly/lastSuccessfulBuild/artifact/build/*zip*/build.zip" -o $logFile
if [ ! -f build.zip ]; then echo "ERROR:build.zip (from Hudson) not found" >> $logFile; exit -2; fi
unzip build.zip >> $logFile
echo "[`date +%Y/%m/%d\ %H:%M`]: publishing nightly build ..." >> $logFile
mkdir -p $PROMO_LOGS_DIR
$ANT -f $RELENG_DIR/promote.xml -Dpromote.properties=$RELENG_DIR/promote-I.properties 2>/dev/null 1> $PROMO_LOGS_DIR/cbi-amalgam-promo-I.txt
