//  FORMA INCORRETA
const permission = (user: any) => user.role === "admin";
const age = (age: any) => age >= 18;
const active = (user: any) => user.subscriptionStatus === "active";

//  FORMA CORRETA
const hasPermission = (user: any) => user.role === "admin";
const isAdult = (age: any) => age >= 18;
const hasActiveSubscription = (user: any) =>
  user.subscriptionStatus === "active";
