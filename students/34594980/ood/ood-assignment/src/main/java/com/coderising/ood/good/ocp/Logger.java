package com.coderising.ood.good.ocp;

/**
 * 对bad包内的代码进行重构
 * 
 * @author chenming E-mail:cm_20094020@163.com
 * @version 创建时间：2017年6月21日 下午11:59:50
 */
public class Logger {

	Formatter formatter;
	Sender sender;

	public Logger(){}
	
	public Logger(Formatter formatter, Sender sender) {
		this.formatter = formatter;
		this.sender = sender;
	}

	public void log(String msg) {
		sender.send(formatter.format(msg));
	}
}
