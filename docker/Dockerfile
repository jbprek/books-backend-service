FROM ibmcom/db2

ENV DB2INST1_PASSWORD=db2-pwd
ENV LICENCE=db2-pwd

RUN mkdir /var/custom
COPY createschema.sh /var/custom
RUN chmod a+x /var/custom/createschema.sh