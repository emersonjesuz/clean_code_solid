// FORMA INCORRETA
function sendNotification1(isUrgent: boolean) {
  console.log(isUrgent ? "Urgent" : "Not Urgent");
}
sendNotification1(true);

// FORMA CORRETA
enum NotificationType {
  URGENT = "Urgent",
  REGULAR = "Not Urgent",
}

function sendNotification2(priority: NotificationType) {
  console.log(priority);
}
sendNotification2(NotificationType.URGENT);
