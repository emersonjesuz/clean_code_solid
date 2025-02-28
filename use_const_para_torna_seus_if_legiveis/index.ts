// FORMA INCORRETA

function canAccessDashboard(user: any) {
  return (
    user.isActive && user.age >= 18 && user.subscriptionStatus === "active"
  );
}

// FORMA CORRETA

function canAccessDashboard2(user: any) {
  const isUserActive = user.isActive;
  const isUserOldEnough = user.age >= 18;
  const hasActiveSubscription = user.subscriptionStatus === "active";

  return isUserActive && isUserOldEnough && hasActiveSubscription;
}
