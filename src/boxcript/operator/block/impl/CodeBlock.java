package boxcript.operator.block.impl;

import boxcript.operator.block.Block;

public class CodeBlock implements Block {
	private String operatorString = "{";	@Override public String getOperatorString() { return operatorString; }
	private String endString = "}";			@Override public String getEndString() { return endString; }
	private boolean hasInnerBlock = true;	@Override public boolean hasInnerBlock() { return hasInnerBlock; }
	private int orderNum;					@Override public int getOrderNum() { return orderNum; }
	public CodeBlock(int orderNum) {
		this.orderNum = orderNum;
	}
}
