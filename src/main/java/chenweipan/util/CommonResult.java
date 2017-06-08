package chenweipan.util;

public class CommonResult {

	private String code;
	private Object detail;

	public CommonResult() {
	}
	/**
	 * 错误码，根据具体业务约定内容，形式通常是 "buz.error.detail"
	 * 
	 * @return 错误码，用于用统一的方法判断错误原因
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 错误详情，具体内容根据接口情况约定。<br>
	 * 注意：<strong>不要偷懒返回错误栈</strong>
	 * 
	 * @return 可以详细描述错误内容的与行业领域相关的复杂对象，比如 {@link BindingResult} 之类的对象
	 */
	public Object getDetail() {
		return detail;
	}

	public void setDetail(Object detail) {
		this.detail = detail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonResult [code=");
		builder.append(code);
		builder.append(", detail=");
		builder.append(detail);
		builder.append("]");
		return builder.toString();
	}

}
