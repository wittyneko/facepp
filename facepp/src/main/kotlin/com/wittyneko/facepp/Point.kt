package com.wittyneko.facepp

interface Point {
    val index: Int
}

enum class Point81(override val index: Int) : Point {
    contour_chin(64), contour_left1(62), contour_right1(63),

    left_eye_center(0), left_eye_left_corner(1), left_eye_right_corner(2), left_eye_top(3), left_eye_bottom(4),
    left_eye_upper_left_quarter(5), left_eye_lower_left_quarter(6), left_eye_upper_right_quarter(7), left_eye_lower_right_quarter(8),
    right_eye_center(9), right_eye_left_corner(10), right_eye_right_corner(11), right_eye_top(12), right_eye_bottom(13),
    right_eye_upper_left_quarter(14), right_eye_lower_left_quarter(15), right_eye_upper_right_quarter(16), right_eye_lower_right_quarter(17),

    left_eyebrow_left_corner(18), left_eyebrow_right_corner(19), left_eyebrow_upper_middle(20), left_eyebrow_lower_middle(21),
    left_eyebrow_upper_left_quarter(22), left_eyebrow_lower_left_quarter(23), left_eyebrow_upper_right_quarter(24), left_eyebrow_lower_right_quarter(25),
    right_eyebrow_left_corner(26), right_eyebrow_right_corner(27), right_eyebrow_upper_middle(28), right_eyebrow_lower_middle(29),
    right_eyebrow_upper_left_quarter(30), right_eyebrow_lower_left_quarter(31), right_eyebrow_upper_right_quarter(32), right_eyebrow_lower_right_quarter(33),

    nose_tip(34), nose_contour_lower_middle(35),
    nose_left(40), nose_contour_left1(36), nose_contour_left2(38), nose_contour_left3(42),
    nose_right(41), nose_contour_right1(37), nose_contour_right2(39), nose_contour_right3(43),

    mouth_left_corner(44), mouth_right_corner(45),
    mouth_upper_lip_top(46), mouth_upper_lip_bottom(47),
    mouth_upper_lip_left_contour1(48), mouth_upper_lip_left_contour2(50), mouth_upper_lip_left_contour3(52),
    mouth_upper_lip_right_contour1(49), mouth_upper_lip_right_contour2(51), mouth_upper_lip_right_contour3(53),
    mouth_lower_lip_top(54), mouth_lower_lip_bottom(55),
    mouth_lower_lip_left_contour1(56), mouth_lower_lip_left_contour2(58), mouth_lower_lip_left_contour3(59),
    mouth_lower_lip_right_contour1(57), mouth_lower_lip_right_contour2(61), mouth_lower_lip_right_contour3(60),
}

enum class Point106(override val index: Int) : Point {
    contour_chin(16), contour_left1(0), contour_right1(32),

    left_eye_pupil(104), right_eye_pupil(105),
    left_eye_center(74), left_eye_left_corner(52), left_eye_right_corner(55), left_eye_top(72), left_eye_bottom(73),
    left_eye_upper_left_quarter(53), left_eye_upper_right_quarter(54), left_eye_lower_left_quarter(57), left_eye_lower_right_quarter(56),
    right_eye_center(77), right_eye_left_corner(58), right_eye_right_corner(61), right_eye_top(75), right_eye_bottom(76),
    right_eye_upper_left_quarter(59), right_eye_upper_right_quarter(60), right_eye_lower_left_quarter(63), right_eye_lower_right_quarter(62),

    left_eyebrow_left_corner(33), left_eyebrow_right_corner(37),
    left_eyebrow_upper_left_quarter(34), left_eyebrow_upper_middle(35), left_eyebrow_upper_right_quarter(36), left_eyebrow_upper_right_corner(37),
    left_eyebrow_lower_left_quarter(64), left_eyebrow_lower_middle(65), left_eyebrow_lower_right_quarter(66), left_eyebrow_lower_right_corner(67),
    right_eyebrow_right_corner(42), right_eyebrow_left_corner(38),
    right_eyebrow_upper_left_quarter(39), right_eyebrow_upper_middle(40), right_eyebrow_upper_right_quarter(41), right_eyebrow_upper_left_corner(38),
    right_eyebrow_lower_left_quarter(69), right_eyebrow_lower_middle(70), right_eyebrow_lower_right_quarter(71), right_eyebrow_lower_left_corner(68),

    nose_tip(46), nose_contour_lower_middle(49), nose_bridge1(43), nose_bridge2(44), nose_bridge3(45),
    nose_left(82), nose_contour_left1(78), nose_contour_left2(80), nose_contour_left3(82), nose_contour_left4(47), nose_contour_left5(48),
    nose_right(83), nose_contour_right1(79), nose_contour_right2(81), nose_contour_right3(83), nose_contour_right4(51), nose_contour_right5(50),

    mouth_left_corner(84), mouth_right_corner(90),
    mouth_upper_lip_top(87), mouth_upper_lip_bottom(98),
    mouth_upper_lip_left_contour1(86), mouth_upper_lip_left_contour2(85), mouth_upper_lip_left_contour3(97), mouth_upper_lip_left_contour4(96),
    mouth_upper_lip_right_contour1(88), mouth_upper_lip_right_contour2(89), mouth_upper_lip_right_contour3(99), mouth_upper_lip_right_contour4(100),
    mouth_lower_lip_top(102), mouth_lower_lip_bottom(93),
    mouth_lower_lip_left_contour1(103), mouth_lower_lip_left_contour2(95), mouth_lower_lip_left_contour3(94),
    mouth_lower_lip_right_contour1(101), mouth_lower_lip_right_contour2(91), mouth_lower_lip_right_contour3(92),
}