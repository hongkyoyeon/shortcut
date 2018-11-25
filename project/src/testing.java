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
		
		/*좌표 찍어서 버스 노선만들기, 정류장이면 true, 아니면 false*/
		/*노랑색 노선임*/
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
		
		
		BusRoute brown = new BusRoute(Color.GREEN,5, 300, 60);
		brown.AddPoint(new mpoint(1,369), true);
		brown.AddPoint(new mpoint(113,307), true);
		brown.AddPoint(new mpoint(173,286), true);
		brown.AddPoint(new mpoint(244,266), true);
		brown.AddPoint(new mpoint(217,137), true);
		brown.AddPoint(new mpoint(188,59), true);
		brown.AddPoint(new mpoint(271,42), true);
		brown.AddPoint(new mpoint(344,47), true);
		brown.AddPoint(new mpoint(456,46), true);
		
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