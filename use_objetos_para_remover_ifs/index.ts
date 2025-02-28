function getOrderMessage(status: string): string {
  if (status === "pending") {
    return "Order is pending";
  } else if (status === "shipped") {
    return "Order is shipped";
  } else if (status === "delivered") {
    return "Order is delivered";
  }
  return "";
}

enum OrderStatus {
  Pending = "pending",
  Shipped = "shipped",
  Delivered = "delivered",
}

const orderMessages = {
  [OrderStatus.Pending]: "Order is pending",
  [OrderStatus.Shipped]: "Order is shipped",
  [OrderStatus.Delivered]: "Order is delivered",
};

function getOrderMessage2(status: OrderStatus): string {
  return orderMessages[status];
}
