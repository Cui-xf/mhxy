package com.cc.asset.role

import com.cc.screens.fight.model.*

fun buildRoleResId(
    job: RoleJob,
    gender: RoleGender,
    appearance: Appearance,
    ride: Ride,
    dir: Dir,
    animState: RoleAnimState
): String {
    return "rpg/role/${job}_${gender}_${appearance}_${ride}_${dir}_${animState}.anim"
}
