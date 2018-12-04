import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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

      /*지도 만드는 좌표를 mpoint로 연결*/
		new edge(new mpoint(40, 91),new mpoint(0,0),25);
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
		new edge(new mpoint(842,172),new mpoint(987,105),25);
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
		
		new edge(new mpoint(857,326),new mpoint(892,302),25);
		
		new edge(new mpoint(892,302),new mpoint(996,238),25);
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
		new edge(new mpoint(160,492),new mpoint(154,435),20);
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
		new edge(new mpoint(160,492),new mpoint(203,484),25);
		new edge(new mpoint(249,472),new mpoint(203,484),25);
		new edge(new mpoint(110,505),new mpoint(126,602),20);
		new edge(new mpoint(93,626),new mpoint(126,602),20);
		new edge(new mpoint(93,626),new mpoint(1,686),20);
		new edge(new mpoint(93,626),new mpoint(101,702),20);
		new edge(new mpoint(135,704),new mpoint(126,602),20); //여기도 130->135
		new edge(new mpoint(160,492),new mpoint(167,555),20);
		new edge(new mpoint(145,560),new mpoint(167,555),15);
		new edge(new mpoint(145,560),new mpoint(155,650),15);
		new edge(new mpoint(181,642),new mpoint(155,650),15);
		new edge(new mpoint(181,642),new mpoint(167,555),20);
		new edge(new mpoint(181,642),new mpoint(191,703),20);
		new edge(new mpoint(163,703),new mpoint(155,650),15);//여기도 바꿈 (158->163)
		new edge(new mpoint(135,704),new mpoint(130,659),15);  ////여기 고침!!(130->135)
		new edge(new mpoint(130,659),new mpoint(155,650),15);
		
		new edge(new mpoint(203,484),new mpoint(160,492),15);
		new edge(new mpoint(203,484),new mpoint(249,472),15);
		new edge(new mpoint(203,484),new mpoint(229,683),20);
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
		new edge(new mpoint(578,600),new mpoint(544,526),25);
		new edge(new mpoint(454,569),new mpoint(544,526),25);
		new edge(new mpoint(578,600),new mpoint(464,654),25);
		new edge(new mpoint(578,600),new mpoint(629,695),25);
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
		new edge(new mpoint(695,446),new mpoint(741,421),25);
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
		new edge(new mpoint(915,350),new mpoint(1001,320),15);
		

		

		
		System.out.println(edge_point.allitem.size());
		
		/*여기서 부터는 offset추가해서 보여지는 지도에서 외곽부분 동그란거 수정*/
		edge e_p = edge_point.allitem.get(new mpoint(0,0)).edge_list.get(new mpoint(40,91));
		edge e_p2 = edge_point.allitem.get(new mpoint(172,2)).edge_list.get(new mpoint(181,29));
		edge e_p3 = edge_point.allitem.get(new mpoint(13,193)).edge_list.get(new mpoint(0,165));
		edge e_p4 = edge_point.allitem.get(new mpoint(842,172)).edge_list.get(new mpoint(987,105));
		edge e_p5 = edge_point.allitem.get(new mpoint(870,29)).edge_list.get(new mpoint(863,7));
		edge e_p6 = edge_point.allitem.get(new mpoint(13, 193)).edge_list.get(new mpoint(0,165));
		
		e_p.offset = 1;
		e_p2.offset=1;
		e_p3.offset=1;
		e_p4.offset=1;
		e_p5.offset=1;
		e_p6.offset=1;
		
		/*버스 노선 따라서 버스가 움직이게! / true는 정류장, false는 그냥 길*/
		BusRoute yellow = new BusRoute("bus11.png",5, 3000, 300);
		yellow.AddPoint(new mpoint(0,0), false);
		yellow.AddPoint(new mpoint(40,91), true);
		yellow.AddPoint(new mpoint(64,174), false);
		yellow.AddPoint(new mpoint(139,158), false);
		yellow.AddPoint(new mpoint(217,137), true);
		yellow.AddPoint(new mpoint(244,266), false);
		yellow.AddPoint(new mpoint(337,257), false);
		yellow.AddPoint(new mpoint(413,267), true);
		yellow.AddPoint(new mpoint(497,274), false);
		yellow.AddPoint(new mpoint(633,354), false);
		yellow.AddPoint(new mpoint(670,356), false);
		yellow.AddPoint(new mpoint(716,356), true);
		yellow.AddPoint(new mpoint(808,347), false);
		yellow.AddPoint(new mpoint(857,326), false);
		yellow.AddPoint(new mpoint(892,302), false);
		yellow.AddPoint(new mpoint(996,238), false);
		
		
		BusRoute brown = new BusRoute("bus2.png",5, 3000, 300);
		brown.AddPoint(new mpoint(1,369), false);
		brown.AddPoint(new mpoint(113,307), true);
		brown.AddPoint(new mpoint(173,286), false);
		brown.AddPoint(new mpoint(139,158), false);
		brown.AddPoint(new mpoint(217,137), false);
		brown.AddPoint(new mpoint(188,59), false);
		brown.AddPoint(new mpoint(271,42), false);
		brown.AddPoint(new mpoint(344,47), false);
		brown.AddPoint(new mpoint(456,46), true);
		brown.AddPoint(new mpoint(454,1), false);
		
		
		BusRoute red = new BusRoute("bus3.png",5, 3000, 210);
		red.AddPoint(new mpoint(13,193), false);
		red.AddPoint(new mpoint(64,174), false);
		red.AddPoint(new mpoint(139,158), false);
		red.AddPoint(new mpoint(217,137), false);
		red.AddPoint(new mpoint(340,145), false);
		red.AddPoint(new mpoint(455,142), false);
		red.AddPoint(new mpoint(527,146), true);
		red.AddPoint(new mpoint(633,197), false);
		red.AddPoint(new mpoint(662,202), false);
		red.AddPoint(new mpoint(700,199), false);
		red.AddPoint(new mpoint(808,178), false);
		red.AddPoint(new mpoint(842,172), false);
		red.AddPoint(new mpoint(987,105), false);
		
		
		BusRoute purple = new BusRoute("bus4.png",5, 3000, 350);
		purple.AddPoint(new mpoint(524,1), false);
		purple.AddPoint(new mpoint(525,41), false);
		purple.AddPoint(new mpoint(527,115), false);
		purple.AddPoint(new mpoint(527,146), false);
		purple.AddPoint(new mpoint(497,274), false);
		purple.AddPoint(new mpoint(489,310), true);
		purple.AddPoint(new mpoint(612,491), false);
		purple.AddPoint(new mpoint(653,561), false);
		purple.AddPoint(new mpoint(732,693), false);
		
		
		BusRoute blue = new BusRoute("bus5.png",5, 3000, 320);
		blue.AddPoint(new mpoint(863,7), false);
		blue.AddPoint(new mpoint(870,29), false);
		blue.AddPoint(new mpoint(811,41), false);
		blue.AddPoint(new mpoint(780,42), true);
		blue.AddPoint(new mpoint(677,48), false);
		blue.AddPoint(new mpoint(649,49), false);
		blue.AddPoint(new mpoint(620,49), false);
		blue.AddPoint(new mpoint(631,145), true);
		blue.AddPoint(new mpoint(527,115), false);
		blue.AddPoint(new mpoint(527,146), false);
		blue.AddPoint(new mpoint(497,274), false);
		blue.AddPoint(new mpoint(489,310), true);
		blue.AddPoint(new mpoint(430,313), false);
		blue.AddPoint(new mpoint(364,328), false);
		blue.AddPoint(new mpoint(389,394), false);
		blue.AddPoint(new mpoint(396,413), false);
		blue.AddPoint(new mpoint(416,449), false);
		blue.AddPoint(new mpoint(454,569), false);
		blue.AddPoint(new mpoint(464,654), false);
		blue.AddPoint(new mpoint(488,699), false);
		
		
		BusRoute green = new BusRoute("bus6.png",5, 3000, 550);
		green.AddPoint(new mpoint(863,7), false);
		green.AddPoint(new mpoint(870,29), false);
		green.AddPoint(new mpoint(890,91), true);
		green.AddPoint(new mpoint(825,119), false);
		green.AddPoint(new mpoint(796,125), false);
		green.AddPoint(new mpoint(690,142), false);
		green.AddPoint(new mpoint(660,144), false);
		green.AddPoint(new mpoint(631,145), false);
		green.AddPoint(new mpoint(633,197), false);
		green.AddPoint(new mpoint(633,354), true);
		green.AddPoint(new mpoint(656,465), false);
		green.AddPoint(new mpoint(612,491), false);
		green.AddPoint(new mpoint(544,526), false);
		green.AddPoint(new mpoint(454,569), false);
		green.AddPoint(new mpoint(362,615), false);
		green.AddPoint(new mpoint(292,664),false);
		green.AddPoint(new mpoint(229,683), true);
		green.AddPoint(new mpoint(231,701), false);
		
			
		BusRoute Darkgreen = new BusRoute("bus7.png",5, 3000, 170);
		Darkgreen.AddPoint(new mpoint(0,439), false);
		Darkgreen.AddPoint(new mpoint(90,402), true);
		Darkgreen.AddPoint(new mpoint(150,381), false);
		Darkgreen.AddPoint(new mpoint(233,356), false);
		Darkgreen.AddPoint(new mpoint(242,418), true);
		Darkgreen.AddPoint(new mpoint(249,472), false);
		Darkgreen.AddPoint(new mpoint(266,548), false);
		Darkgreen.AddPoint(new mpoint(292,664), false);
		Darkgreen.AddPoint(new mpoint(362,615), true);
		Darkgreen.AddPoint(new mpoint(454,569), true);
		Darkgreen.AddPoint(new mpoint(544,526), false);
		Darkgreen.AddPoint(new mpoint(578,600), false);
		Darkgreen.AddPoint(new mpoint(629,695), false);
		
		
		BusRoute Dark = new BusRoute("bus8.png",5, 3000, 220);
		Dark.AddPoint(new mpoint(1,686), false);
		Dark.AddPoint(new mpoint(93,626), true);
		Dark.AddPoint(new mpoint(126,602), false);
		Dark.AddPoint(new mpoint(110,505), false);
		Dark.AddPoint(new mpoint(160,492), false);
		Dark.AddPoint(new mpoint(203,484), false);
		Dark.AddPoint(new mpoint(249,472), false);
		Dark.AddPoint(new mpoint(242,418), false);
		Dark.AddPoint(new mpoint(292,406), false);
		Dark.AddPoint(new mpoint(299,446), false);
		Dark.AddPoint(new mpoint(396,413), false);
		Dark.AddPoint(new mpoint(389,394), false);
		Dark.AddPoint(new mpoint(454,363), false);
		Dark.AddPoint(new mpoint(485,415), false);
		Dark.AddPoint(new mpoint(544,526), false);
		Dark.AddPoint(new mpoint(612,491), true);
		Dark.AddPoint(new mpoint(656,465), false);
		Dark.AddPoint(new mpoint(695,446), false);
		Dark.AddPoint(new mpoint(741,421), false);
		Dark.AddPoint(new mpoint(764,457), false);
		Dark.AddPoint(new mpoint(797,487), true);
		Dark.AddPoint(new mpoint(862,465), false);
		Dark.AddPoint(new mpoint(894,431), false);
		Dark.AddPoint(new mpoint(857,326), false);
		Dark.AddPoint(new mpoint(892,302), true);
		Dark.AddPoint(new mpoint(996,238), false);
		
		
		BusRoute Lightblue = new BusRoute("bus9.png",5, 3000, 300);
		Lightblue.AddPoint(new mpoint(135,704), false); //여기도 130->135로 고침!
		Lightblue.AddPoint(new mpoint(130,659), false);
		Lightblue.AddPoint(new mpoint(155,650), false);
		Lightblue.AddPoint(new mpoint(181,642), true);
		Lightblue.AddPoint(new mpoint(167,555), false);
		Lightblue.AddPoint(new mpoint(160,492), false);
		Lightblue.AddPoint(new mpoint(203,484), false);
		Lightblue.AddPoint(new mpoint(249,472), false);
		Lightblue.AddPoint(new mpoint(242,418), false);
		Lightblue.AddPoint(new mpoint(233,356), false);
		Lightblue.AddPoint(new mpoint(286,343), true);
		Lightblue.AddPoint(new mpoint(292,406), false);
		Lightblue.AddPoint(new mpoint(299,446), false);
		Lightblue.AddPoint(new mpoint(329,525), false);
		Lightblue.AddPoint(new mpoint(362,615), false);
		Lightblue.AddPoint(new mpoint(382,684), false);
		Lightblue.AddPoint(new mpoint(385,700), false);
		
		
		
		BusRoute pink = new BusRoute("bus10.png",5, 3000, 150);
		pink.AddPoint(new mpoint(793,693), false);
		pink.AddPoint(new mpoint(803,592), true);
		pink.AddPoint(new mpoint(868,572), false);
		pink.AddPoint(new mpoint(909,554), true);
		pink.AddPoint(new mpoint(886,510), false);
		pink.AddPoint(new mpoint(914,492), false);
		pink.AddPoint(new mpoint(939,465), false);
		pink.AddPoint(new mpoint(931,405), false);
		pink.AddPoint(new mpoint(915,350), true);
		pink.AddPoint(new mpoint(1001,320), false);
		
		
		
		BusRoute Darkbrown = new BusRoute("bus.png",5, 3000, 250);
		Darkbrown.AddPoint(new mpoint(987,105), false);
		Darkbrown.AddPoint(new mpoint(842,172), false);
		Darkbrown.AddPoint(new mpoint(808,178), true);
		Darkbrown.AddPoint(new mpoint(857,326), false);
		Darkbrown.AddPoint(new mpoint(894,431), false);
		Darkbrown.AddPoint(new mpoint(862,465), false);
		Darkbrown.AddPoint(new mpoint(797,487), false);
		Darkbrown.AddPoint(new mpoint(804,539), false);
		Darkbrown.AddPoint(new mpoint(803,592), false);
		Darkbrown.AddPoint(new mpoint(793,693), false);

		PaintToolFrame component = new PaintToolFrame(1,new Color(255,255,255));
		frame.add(component);
		frame.setVisible(true);
		Main main = new Main();
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