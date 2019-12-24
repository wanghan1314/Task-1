#!/bin/sh
#dirname $0:ȡ�õ�ǰִ�нű��ļ��ĸ�Ŀ¼  cd`dirname $0`:�������Ŀ¼ pwd:��ʾ��ǰĿ¼��cdִ�к�
bin=$(cd `dirname $0`; pwd)

#ps aux����ʾ���н��̺���״̬  grep:����  grep -v grep�����˵�����grep����   awk:���ζ�ÿһ�н��д���Ȼ�������print $2������ڶ����ֶ� 
pid=$(ps aux | grep tomcat | grep -v grep | grep -v restart | grep ${bin} | awk '{print $2}') 

# -n:�����ж��ַ����Ƿ���� 
#����Ѿ���������shutdown�����������shutdown֮��3sû��ͣ��tomcat���̣���kill��ԭ���Ľ�����������
#���tomcatû��������ֱ��������

if [ -n "${pid}" ]; then
    echo "Shutdown..."
    sh ${bin}/shutdown.sh
    sleep 3

    pid=$(ps aux | grep tomcat | grep -v grep | grep -v restart | grep ${bin} | awk '{print $2}')
    if [ -n "${pid}" ]; then
        kill -9 ${pid}
        sleep 1
    fi
fi

echo "Startup..."
sh ${bin}/startup.sh
if [ "$1" = "-v" ]; then
    tail -f ${bin}/../logs/catalina.out
fi