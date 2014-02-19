package com.ruckuswireless.pentaho.kafka.producer;

import kafka.javaapi.producer.Producer;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.core.row.ValueMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Holds data processed by this step
 * 
 * @author Michael
 */
public class KafkaProducerData extends BaseStepData implements StepDataInterface {

	Producer<Object, Object> producer;
	RowMetaInterface outputRowMeta;
	int inputFieldNr;
	ValueMetaInterface inputFieldMeta;
}
