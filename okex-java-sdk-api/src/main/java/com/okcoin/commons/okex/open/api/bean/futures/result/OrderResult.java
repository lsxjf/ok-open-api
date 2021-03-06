package com.okcoin.commons.okex.open.api.bean.futures.result;

/**
 * New Order Result
 *
 * @author Tony Tian
 * @version 1.0.0
 * @date 2018/3/9 15:56
 */
public class OrderResult {
    /**
     * You setting order id.
     */
    private String client_oid;
    /**
     * The order id provided by OKEx.
     */
    private String order_id;
    /**
     * The Server processing results: true: successful, false: failure.
     */
    private String result;

    private String error_code;
    private String error_message;

    public String getClient_oid() {
        return client_oid;
    }

    public void setClient_oid(String client_oid) {
        this.client_oid = client_oid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_messsage() {
        return error_message;
    }

    public void setError_messsage(String error_messsage) {
        this.error_message = error_messsage;
    }

    @Override
    public String toString() {
        return "OrderResult{" +
                "client_oid='" + client_oid + '\'' +
                ", order_id='" + order_id + '\'' +
                ", result='" + result + '\'' +
                ", error_code='" + error_code + '\'' +
                ", error_message='" + error_message + '\'' +
                '}';
    }
}
