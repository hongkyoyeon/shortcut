import javax.swing.JFrame;
import java.awt.*;
public class testing

{
	
	public static JFrame aframe;
	public static void main(String[] args)
	{
		
		JFrame frame =new JFrame();
		aframe = frame;
		final int width =990;
		final int height =715;
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		new edge(new mpoint(0, 0),new mpoint(40, 91),25);
		new edge(new mpoint(40, 91),new mpoint(64,174),25);
		new edge(new mpoint(64, 174),new mpoint(13, 193),25);
		new edge(new mpoint(13, 193),new mpoint(0,165),25);
		new edge(new mpoint(13, 193),new mpoint(38,257),25);
		new edge(new mpoint(38,257),new mpoint(0,238),25);
		new edge(new mpoint(38,257),new mpoint(113,307),25);
		new edge(new mpoint(113,307),new mpoint(1,369),25);
		new edge(new mpoint(113,307),new mpoint(173,286),25);
		new edge(new mpoint(173,286),new mpoint(139,158),25);
		new edge(new mpoint(139,158),new mpoint(64,174),25);
		new edge(new mpoint(40,91),new mpoint(117,81),25);
		new edge(new mpoint(117,81),new mpoint(99,1),25);
		new edge(new mpoint(117,81),new mpoint(188,59),25);
		new edge(new mpoint(188,59),new mpoint(181,29),25);
		new edge(new mpoint(181,29),new mpoint(172,2),25);
		new edge(new mpoint(181,29),new mpoint(273,5),20);
		new edge(new mpoint(188,59),new mpoint(271,42),25);
		new edge(new mpoint(117,81),new mpoint(139,158),25);
		new edge(new mpoint(139,158),new mpoint(217,137),25);
		new edge(new mpoint(217,137),new mpoint(244,266),25);
		new edge(new mpoint(244,266),new mpoint(173,286),25);
		new edge(new mpoint(217,137),new mpoint(188,59),25);
		new edge(new mpoint(217,137),new mpoint(271,42),25);
		new edge(new mpoint(273,5),new mpoint(271,42),25);
		new edge(new mpoint(341,1),new mpoint(344,47),25);
		new edge(new mpoint(271,42),new mpoint(344,47),25);
		new edge(new mpoint(344,47),new mpoint(340,145),25);
		new edge(new mpoint(340,145),new mpoint(217,137),25);
		new edge(new mpoint(340,145),new mpoint(337,257),25);
		new edge(new mpoint(337,257),new mpoint(244,266),25);
		new edge(new mpoint(454,1),new mpoint(456,46),25);
		new edge(new mpoint(456,46),new mpoint(344,47),25);
		new edge(new mpoint(456,46),new mpoint(455,142),25);
		new edge(new mpoint(455,142),new mpoint(340,145),25);
		new edge(new mpoint(455,142),new mpoint(527,146),25);
		new edge(new mpoint(527,146),new mpoint(497,274),25);
		new edge(new mpoint(497,274),new mpoint(413,267),25);
		new edge(new mpoint(413,267),new mpoint(337,257),25);
		new edge(new mpoint(524,1),new mpoint(525,41),25);
		new edge(new mpoint(525,41),new mpoint(456,46),25);
		new edge(new mpoint(525,41),new mpoint(527,115),25);
		new edge(new mpoint(527,115),new mpoint(527,146),25);
		new edge(new mpoint(525,41),new mpoint(620,49),25);
		new edge(new mpoint(620,49),new mpoint(649,49),25);
		new edge(new mpoint(649,49),new mpoint(677,48),25);
		new edge(new mpoint(677,48),new mpoint(780,42),25);
		new edge(new mpoint(780,42),new mpoint(811,41),25);
		new edge(new mpoint(811,41),new mpoint(870,29),25);
		new edge(new mpoint(870,29),new mpoint(863,7),25);
		new edge(new mpoint(525,41),new mpoint(620,49),25);
		new edge(new mpoint(620,49),new mpoint(631,145),15);
		new edge(new mpoint(649,49),new mpoint(660,144),15);
		new edge(new mpoint(677,48),new mpoint(690,142),15);
		new edge(new mpoint(527,115),new mpoint(631,145),25);
		new edge(new mpoint(631,145),new mpoint(660,144),25);
		new edge(new mpoint(660,144),new mpoint(690,142),25);
		new edge(new mpoint(690,142),new mpoint(796,125),25);
		new edge(new mpoint(796,125),new mpoint(825,119),25);
		new edge(new mpoint(825,119),new mpoint(890,91),25);
		new edge(new mpoint(890,91),new mpoint(870,29),25);
		new edge(new mpoint(780,42),new mpoint(796,125),15);
		new edge(new mpoint(811,41),new mpoint(825,119),15);
		new edge(new mpoint(527,146),new mpoint(633,197),25);
		new edge(new mpoint(633,197),new mpoint(662,202),25);
		new edge(new mpoint(662,202),new mpoint(700,199),25);
		new edge(new mpoint(700,199),new mpoint(808,178),25);
		new edge(new mpoint(808,178),new mpoint(842,172),25);
		new edge(new mpoint(842,172),new mpoint(987,150),25);
		new edge(new mpoint(631,145),new mpoint(633,197),15);
		new edge(new mpoint(660,144),new mpoint(662,202),15);
		new edge(new mpoint(690,142),new mpoint(700,199),15);
		new edge(new mpoint(796,125),new mpoint(808,178),15);
		new edge(new mpoint(825,119),new mpoint(842,172),15);
		new edge(new mpoint(633,197),new mpoint(633,354),15);
		new edge(new mpoint(662,202),new mpoint(670,356),15);
		new edge(new mpoint(700,199),new mpoint(716,356),15);
		new edge(new mpoint(497,274),new mpoint(633,354),25);
		new edge(new mpoint(633,354),new mpoint(670,356),25);
		new edge(new mpoint(670,356),new mpoint(716,356),25);
		new edge(new mpoint(716,356),new mpoint(808,347),25);
		new edge(new mpoint(808,347),new mpoint(857,326),25);
		new edge(new mpoint(857,326),new mpoint(897,302),25);
		new edge(new mpoint(897,302),new mpoint(996,238),25);
		new edge(new mpoint(808,178),new mpoint(857,326),15);
		new edge(new mpoint(842,172),new mpoint(892,302),15);
		new edge(new mpoint(0,439),new mpoint(90,402),25);
		new edge(new mpoint(90,402),new mpoint(150,381),25);
		new edge(new mpoint(150,381),new mpoint(233,356),25);
		new edge(new mpoint(233,356),new mpoint(286,343),25);
		new edge(new mpoint(286,343),new mpoint(364,328),25);
		new edge(new mpoint(364,328),new mpoint(430,313),25);
		new edge(new mpoint(430,313),new mpoint(413,267),25);
		new edge(new mpoint(430,313),new mpoint(489,310),25);
		new edge(new mpoint(489,310),new mpoint(497,274),25);
		new edge(new mpoint(90,402),new mpoint(110,505),20);
		new edge(new mpoint(110,505),new mpoint(1,540),25);
		new edge(new mpoint(110,505),new mpoint(160,492),25);
		new edge(new mpoint(160,492),new mpoint(156,435),20);
		new edge(new mpoint(156,435),new mpoint(150,381),20);
		new edge(new mpoint(156,435),new mpoint(242,418),25);
		new edge(new mpoint(242,418),new mpoint(249,472),25);
		new edge(new mpoint(242,418),new mpoint(233,356),25);
		new edge(new mpoint(242,418),new mpoint(292,406),25);
		new edge(new mpoint(292,406),new mpoint(286,343),25);
		new edge(new mpoint(292,406),new mpoint(299,446),25);
		new edge(new mpoint(299,446),new mpoint(329,525),25);
		new edge(new mpoint(329,525),new mpoint(266,548),25);
		new edge(new mpoint(266,548),new mpoint(249,472),25);
		new edge(new mpoint(160,492),new mpoint(208,484),25);
		new edge(new mpoint(249,472),new mpoint(208,484),25);
		new edge(new mpoint(110,505),new mpoint(126,602),20);
		new edge(new mpoint(93,626),new mpoint(120,602),25);
		new edge(new mpoint(93,626),new mpoint(1,686),25);
		new edge(new mpoint(93,626),new mpoint(101,702),25);
		new edge(new mpoint(140,704),new mpoint(126,602),20);
		new edge(new mpoint(160,492),new mpoint(167,555),20);
		new edge(new mpoint(145,560),new mpoint(167,555),15);
		new edge(new mpoint(145,560),new mpoint(160,650),15);
		new edge(new mpoint(181,642),new mpoint(160,650),15);
		new edge(new mpoint(181,642),new mpoint(167,555),20);
		new edge(new mpoint(181,642),new mpoint(191,703),20);
		new edge(new mpoint(168,703),new mpoint(160,650),15);
		new edge(new mpoint(130,659),new mpoint(160,650),15);
		new edge(new mpoint(208,484),new mpoint(160,492),15);
		new edge(new mpoint(208,484),new mpoint(249,472),15);
		new edge(new mpoint(208,484),new mpoint(229,683),20);
		new edge(new mpoint(231,701),new mpoint(229,683),20);
		new edge(new mpoint(292,664),new mpoint(229,683),20);
		new edge(new mpoint(292,664),new mpoint(266,548),25);
		new edge(new mpoint(329,525),new mpoint(266,548),20);
		new edge(new mpoint(292,664),new mpoint(301,701),25);
		new edge(new mpoint(329,525),new mpoint(362,615),25);
		new edge(new mpoint(382,684),new mpoint(362,615),25);
		new edge(new mpoint(382,684),new mpoint(301,701),25);
		new edge(new mpoint(382,684),new mpoint(385,700),25);
		new edge(new mpoint(362,615),new mpoint(292,664),25);
		new edge(new mpoint(364,328),new mpoint(389,394),25);
		new edge(new mpoint(396,413),new mpoint(389,394),25);
		new edge(new mpoint(396,413),new mpoint(299,446),25);
		new edge(new mpoint(396,413),new mpoint(416,449),25);
		new edge(new mpoint(454,569),new mpoint(416,449),25);
		new edge(new mpoint(454,569),new mpoint(464,654),25);
		new edge(new mpoint(488,699),new mpoint(464,654),25);
		new edge(new mpoint(454,569),new mpoint(362,615),25);
		new edge(new mpoint(382,684),new mpoint(464,654),25);
		new edge(new mpoint(389,394),new mpoint(454,363),25);
		new edge(new mpoint(485,415),new mpoint(454,363),25);
		new edge(new mpoint(485,415),new mpoint(416,449),25);
		new edge(new mpoint(485,415),new mpoint(544,526),25);
		new edge(new mpoint(578,608),new mpoint(544,526),25);
		new edge(new mpoint(454,569),new mpoint(544,526),25);
		new edge(new mpoint(578,608),new mpoint(464,654),25);
		new edge(new mpoint(578,608),new mpoint(629,695),25);
		new edge(new mpoint(430,313),new mpoint(454,363),25);
		new edge(new mpoint(489,310),new mpoint(612,491),25);
		new edge(new mpoint(653,561),new mpoint(612,491),25);
		new edge(new mpoint(653,561),new mpoint(732,693),25);
		new edge(new mpoint(544,526),new mpoint(612,491),25);
		new edge(new mpoint(653,561),new mpoint(578,600),25);
		new edge(new mpoint(633,354),new mpoint(656,465),15);
		new edge(new mpoint(612,491),new mpoint(656,465),25);
		new edge(new mpoint(670,356),new mpoint(695,446),15);
		new edge(new mpoint(695,446),new mpoint(656,465),25);
		new edge(new mpoint(695,446),new mpoint(736,421),25);
		new edge(new mpoint(716,356),new mpoint(741,421),15);
		new edge(new mpoint(764,457),new mpoint(741,421),15);
		new edge(new mpoint(764,457),new mpoint(797,487),15);
		new edge(new mpoint(739,499),new mpoint(695,446),15);
		new edge(new mpoint(653,561),new mpoint(739,499),25);
		new edge(new mpoint(764,457),new mpoint(739,499),15);
		new edge(new mpoint(804,539),new mpoint(739,499),15);
		new edge(new mpoint(804,539),new mpoint(797,487),20);
		new edge(new mpoint(804,539),new mpoint(803,592),20);
		new edge(new mpoint(793,693),new mpoint(803,592),20);
		new edge(new mpoint(808,347),new mpoint(862,465),20);
		new edge(new mpoint(797,487),new mpoint(862,465),15);
		new edge(new mpoint(894,431),new mpoint(862,465),15);
		new edge(new mpoint(894,431),new mpoint(857,326),15);
		new edge(new mpoint(886,510),new mpoint(862,465),15);
		new edge(new mpoint(886,510),new mpoint(854,523),15);
		new edge(new mpoint(804,539),new mpoint(854,523),15);
		new edge(new mpoint(868,572),new mpoint(854,523),15);
		new edge(new mpoint(868,572),new mpoint(803,592),15);
		new edge(new mpoint(868,572),new mpoint(909,554),15);
		new edge(new mpoint(886,510),new mpoint(854,523),15);
		new edge(new mpoint(886,510),new mpoint(909,554),15);
		new edge(new mpoint(949,624),new mpoint(909,554),15);
		new edge(new mpoint(868,691),new mpoint(909,554),20);
		new edge(new mpoint(949,624),new mpoint(1000,687),15);
		new edge(new mpoint(892,302),new mpoint(915,350),15);
		new edge(new mpoint(931,405),new mpoint(915,350),15);
		new edge(new mpoint(931,405),new mpoint(939,465),15);
		new edge(new mpoint(939,465),new mpoint(914,492),15);
		new edge(new mpoint(886,510),new mpoint(914,492),15);
		new edge(new mpoint(943,517),new mpoint(914,492),15);
		new edge(new mpoint(943,517),new mpoint(909,554),15);
		new edge(new mpoint(943,517),new mpoint(974,484),15);
		new edge(new mpoint(1009,499),new mpoint(974,484),15);
		new edge(new mpoint(1006,440),new mpoint(974,484),15);
		new edge(new mpoint(939,465),new mpoint(974,484),15);
		new edge(new mpoint(931,405),new mpoint(1004,377),15);
		new edge(new mpoint(915,350),new mpoint(915,350),15);
		
		System.out.println(edge_point.allitem.size());
		
		/*醫뚰몴 李띿뼱�꽌 踰꾩뒪 �끂�꽑留뚮뱾湲�, �젙瑜섏옣�씠硫� true, �븘�땲硫� false*/
		/*�끂�옉�깋 �끂�꽑�엫*/
		BusRoute yellow = new BusRoute(Color.RED,5, 300, 60);
		yellow.AddPoint(new mpoint(0,0), true);
		yellow.AddPoint(new mpoint(40,91), true);
		yellow.AddPoint(new mpoint(64,174), false);
		yellow.AddPoint(new mpoint(139,158), false);
		yellow.AddPoint(new mpoint(217,137), true);
		yellow.AddPoint(new mpoint(244,266), true);
		yellow.AddPoint(new mpoint(337,257), false);
		yellow.AddPoint(new mpoint(413,267), false);
		yellow.AddPoint(new mpoint(497,274), true);
		yellow.AddPoint(new mpoint(633,354), true);
		yellow.AddPoint(new mpoint(670,355), true);
		yellow.AddPoint(new mpoint(716,356), true);
		yellow.AddPoint(new mpoint(808,347), true);
		yellow.AddPoint(new mpoint(857,326), true);
		yellow.AddPoint(new mpoint(892,302), true);
		yellow.AddPoint(new mpoint(996,238), true);
		
		
		BusRoute brown = new BusRoute(new Color(0,255,255),5, 300, 60);
		brown.AddPoint(new mpoint(1,369), true);
		brown.AddPoint(new mpoint(113,307), true);
		brown.AddPoint(new mpoint(173,286), true);
		brown.AddPoint(new mpoint(139,158), true);
		brown.AddPoint(new mpoint(217,137), true);
		brown.AddPoint(new mpoint(188,59), true);
		brown.AddPoint(new mpoint(271,42), true);
		brown.AddPoint(new mpoint(344,47), true);
		brown.AddPoint(new mpoint(456,46), true);
		brown.AddPoint(new mpoint(454,1), true);
		
		
		BusRoute red = new BusRoute(new Color(100,100,255),5, 300, 60);
		red.AddPoint(new mpoint(13,193), true);
		red.AddPoint(new mpoint(64,174), true);
		red.AddPoint(new mpoint(139,158), true);
		red.AddPoint(new mpoint(217,137), true);
		red.AddPoint(new mpoint(340,145), true);
		red.AddPoint(new mpoint(455,142), true);
		red.AddPoint(new mpoint(527,146), true);
		red.AddPoint(new mpoint(633,197), true);
		red.AddPoint(new mpoint(622,202), true);
		red.AddPoint(new mpoint(700,199), true);
		red.AddPoint(new mpoint(808,178), true);
		red.AddPoint(new mpoint(842,172), true);
		red.AddPoint(new mpoint(987,105), true);
		
		
		BusRoute purple = new BusRoute(new Color(200,150,150),5, 300, 60);
		purple.AddPoint(new mpoint(524,1), true);
		purple.AddPoint(new mpoint(525,41), true);
		purple.AddPoint(new mpoint(527,115), true);
		purple.AddPoint(new mpoint(527,146), true);
		purple.AddPoint(new mpoint(497,274), true);
		purple.AddPoint(new mpoint(489,310), true);
		purple.AddPoint(new mpoint(612,491), true);
		purple.AddPoint(new mpoint(653,561), true);
		purple.AddPoint(new mpoint(732,693), true);
		
		
		BusRoute blue = new BusRoute(new Color(255,100,255),5, 300, 60);
		blue.AddPoint(new mpoint(863,7), true);
		blue.AddPoint(new mpoint(811,41), true);
		blue.AddPoint(new mpoint(780,42), true);
		blue.AddPoint(new mpoint(677,48), true);
		blue.AddPoint(new mpoint(649,49), true);
		blue.AddPoint(new mpoint(620,49), true);
		blue.AddPoint(new mpoint(631,145), true);
		blue.AddPoint(new mpoint(527,115), true);
		blue.AddPoint(new mpoint(527,146), true);
		blue.AddPoint(new mpoint(497,274), true);
		blue.AddPoint(new mpoint(489,310), true);
		blue.AddPoint(new mpoint(430,313), true);
		blue.AddPoint(new mpoint(364,328), true);
		blue.AddPoint(new mpoint(389,394), true);
		blue.AddPoint(new mpoint(396,413), true);
		blue.AddPoint(new mpoint(416,449), true);
		blue.AddPoint(new mpoint(454,569), true);
		blue.AddPoint(new mpoint(464,654), true);
		blue.AddPoint(new mpoint(488,699), true);
		
		
		
		BusRoute green = new BusRoute(new Color(255,255,0),5, 300, 60);
		green.AddPoint(new mpoint(863,7), true);
		green.AddPoint(new mpoint(870,29), true);
		green.AddPoint(new mpoint(890,91), true);
		green.AddPoint(new mpoint(825,119), true);
		green.AddPoint(new mpoint(796,125), true);
		green.AddPoint(new mpoint(690,142), true);
		green.AddPoint(new mpoint(660,144), true);
		green.AddPoint(new mpoint(631,145), true);
		green.AddPoint(new mpoint(633,197), true);
		green.AddPoint(new mpoint(633,354), true);
		green.AddPoint(new mpoint(656,465), true);
		green.AddPoint(new mpoint(612,491), true);
		green.AddPoint(new mpoint(544,526), true);
		green.AddPoint(new mpoint(454,569), true);
		green.AddPoint(new mpoint(362,615), true);
		green.AddPoint(new mpoint(292,664), true);
		green.AddPoint(new mpoint(229,683), true);
		green.AddPoint(new mpoint(231,701), true);
		
			
		BusRoute Darkgreen = new BusRoute(new Color(150,200,100),5, 300, 60);
		Darkgreen.AddPoint(new mpoint(0,439), true);
		Darkgreen.AddPoint(new mpoint(90,402), true);
		Darkgreen.AddPoint(new mpoint(150,381), true);
		Darkgreen.AddPoint(new mpoint(233,356), true);
		Darkgreen.AddPoint(new mpoint(242,418), true);
		Darkgreen.AddPoint(new mpoint(249,472), true);
		Darkgreen.AddPoint(new mpoint(266,548), true);
		Darkgreen.AddPoint(new mpoint(292,664), true);
		Darkgreen.AddPoint(new mpoint(362,615), true);
		Darkgreen.AddPoint(new mpoint(454,569), true);
		Darkgreen.AddPoint(new mpoint(544,526), true);
		Darkgreen.AddPoint(new mpoint(578,600), true);
		Darkgreen.AddPoint(new mpoint(629,695), true);
		
		
		BusRoute Dark = new BusRoute(new Color(0,0,0),5, 300, 60);
		Dark.AddPoint(new mpoint(1,686), true);
		Dark.AddPoint(new mpoint(93,626), true);
		Dark.AddPoint(new mpoint(126,602), true);
		Dark.AddPoint(new mpoint(110,505), true);
		Dark.AddPoint(new mpoint(160,492), true);
		Dark.AddPoint(new mpoint(203,484), true);
		Dark.AddPoint(new mpoint(249,472), true);
		Dark.AddPoint(new mpoint(242,418), true);
		Dark.AddPoint(new mpoint(292,406), true);
		Dark.AddPoint(new mpoint(299,446), true);
		Dark.AddPoint(new mpoint(396,413), true);
		Dark.AddPoint(new mpoint(389,394), true);
		Dark.AddPoint(new mpoint(454,363), true);
		Dark.AddPoint(new mpoint(485,415), true);
		Dark.AddPoint(new mpoint(544,526), true);
		Dark.AddPoint(new mpoint(612,491), true);
		Dark.AddPoint(new mpoint(656,465), true);
		Dark.AddPoint(new mpoint(695,446), true);
		Dark.AddPoint(new mpoint(741,421), true);
		Dark.AddPoint(new mpoint(764,457), true);
		Dark.AddPoint(new mpoint(797,487), true);
		Dark.AddPoint(new mpoint(862,465), true);
		Dark.AddPoint(new mpoint(894,431), true);
		Dark.AddPoint(new mpoint(857,326), true);
		Dark.AddPoint(new mpoint(892,302), true);
		Dark.AddPoint(new mpoint(996,238), true);
		
		
		BusRoute Lightblue = new BusRoute(new Color(150,200,150),5, 300, 60);
		Lightblue.AddPoint(new mpoint(130,704), true);
		Lightblue.AddPoint(new mpoint(130,659), true);
		Lightblue.AddPoint(new mpoint(155,650), true);
		Lightblue.AddPoint(new mpoint(181,642), true);
		Lightblue.AddPoint(new mpoint(167,555), true);
		Lightblue.AddPoint(new mpoint(160,492), true);
		Lightblue.AddPoint(new mpoint(203,484), true);
		Lightblue.AddPoint(new mpoint(249,472), true);
		Lightblue.AddPoint(new mpoint(242,418), true);
		Lightblue.AddPoint(new mpoint(233,356), true);
		Lightblue.AddPoint(new mpoint(286,343), true);
		Lightblue.AddPoint(new mpoint(292,406), true);
		Lightblue.AddPoint(new mpoint(299,446), true);
		Lightblue.AddPoint(new mpoint(329,525), true);
		Lightblue.AddPoint(new mpoint(362,615), true);
		Lightblue.AddPoint(new mpoint(382,684), true);
		Lightblue.AddPoint(new mpoint(385,700), true);
		
		
		BusRoute pink = new BusRoute(new Color(200,100,100),5, 300, 60);
		pink.AddPoint(new mpoint(793,693), true);
		pink.AddPoint(new mpoint(803,592), true);
		pink.AddPoint(new mpoint(868,572), true);
		pink.AddPoint(new mpoint(909,554), true);
		pink.AddPoint(new mpoint(886,510), true);
		pink.AddPoint(new mpoint(914,492), true);
		pink.AddPoint(new mpoint(939,465), true);
		pink.AddPoint(new mpoint(931,405), true);
		pink.AddPoint(new mpoint(915,350), true);
		pink.AddPoint(new mpoint(1001,320), true);
		
		
		
		BusRoute Darkbrown = new BusRoute(new Color(5,255,5),5, 300, 60);
		Darkbrown.AddPoint(new mpoint(987,105), true);
		Darkbrown.AddPoint(new mpoint(842,172), true);
		Darkbrown.AddPoint(new mpoint(808,178), true);
		Darkbrown.AddPoint(new mpoint(857,326), true);
		Darkbrown.AddPoint(new mpoint(894,431), true);
		Darkbrown.AddPoint(new mpoint(862,465), true);
		Darkbrown.AddPoint(new mpoint(797,487), true);
		Darkbrown.AddPoint(new mpoint(804,539), true);
		Darkbrown.AddPoint(new mpoint(803,592), true);
		Darkbrown.AddPoint(new mpoint(793,693), true);
		
		
		
		
		
		
		
		
		
		PaintToolFrame component = new PaintToolFrame(1,new Color(255,255,255));
		
		frame.add(component);
		frame.setVisible(true);
		
		
		while(true)
		{
			try
			{
			Thread.sleep(16);
			} catch (InterruptedException e)
			{
				
			}
			GameObject.NextFrame();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}