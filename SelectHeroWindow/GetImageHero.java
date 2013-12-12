package SelectHeroWindow;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetImageHero extends JFrame {
	public static BufferedImage Axe, Abaddon, AntiMage, Clinkz, CrystalMaiden,
			Silencer, Huskar, Bristleback, Luna, FacelessVoid, SkywrathMage,
			OgreMagi, Beastmaster, Omniknight, Slark, PhantomLancer,
			QueenOfPain, Dazzle, Tidehunter, Lycan, Riki, Weaver, Batrider,
			Lich, Pudge, ElderTitan, Venomancer, PhantomAssassin,
			ObsidianDestroyer, Zuus;

	public GetImageHero() {
		imageShowing p = new imageShowing();

		JPanel pnlTools = new JPanel();
		pnlTools.setLayout(new FlowLayout());
		setBounds(50, 50, 850, 550);

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(p, BorderLayout.CENTER);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new GetImageHero().setVisible(true);
	}

	class imageShowing extends JPanel implements MouseListener {

		public imageShowing() {

			try {

				GetImageHero.Axe = ImageIO.read(new File(
						"imageHeroes/axe_hphover.png"));
				GetImageHero.Abaddon = ImageIO.read(new File(
						"imageHeroes/abaddon_hphover.png"));
				GetImageHero.AntiMage = ImageIO.read(new File(
						"imageHeroes/antimage_hphover.png"));
				GetImageHero.Clinkz = ImageIO.read(new File(
						"imageHeroes/clinkz_hphover.png"));
				GetImageHero.CrystalMaiden = ImageIO.read(new File(
						"imageHeroes/crystal_maiden_hphover.png"));
				GetImageHero.Silencer = ImageIO.read(new File(
						"imageHeroes/silencer_hphover.png"));
				GetImageHero.Huskar = ImageIO.read(new File(
						"imageHeroes/huskar_hphover.png"));
				GetImageHero.Bristleback = ImageIO.read(new File(
						"imageHeroes/bristleback_hphover.png"));
				GetImageHero.Luna = ImageIO.read(new File(
						"imageHeroes/luna_hphover.png"));
				GetImageHero.FacelessVoid = ImageIO.read(new File(
						"imageHeroes/faceless_void_hphover.png"));
				GetImageHero.SkywrathMage = ImageIO.read(new File(
						"imageHeroes/skywrath_mage_hphover.png"));
				GetImageHero.OgreMagi = ImageIO.read(new File(
						"imageHeroes/ogre_magi_hphover.png"));
				GetImageHero.Beastmaster = ImageIO.read(new File(
						"imageHeroes/beastmaster_hphover.png"));
				GetImageHero.Omniknight = ImageIO.read(new File(
						"imageHeroes/omniknight_hphover.png"));
				GetImageHero.Slark = ImageIO.read(new File(
						"imageHeroes/slark_hphover.png"));
				GetImageHero.PhantomLancer = ImageIO.read(new File(
						"imageHeroes/phantom_lancer_hphover.png"));
				GetImageHero.QueenOfPain = ImageIO.read(new File(
						"imageHeroes/queenofpain_hphover.png"));
				GetImageHero.Dazzle = ImageIO.read(new File(
						"imageHeroes/dazzle_hphover.png"));
				GetImageHero.Tidehunter = ImageIO.read(new File(
						"imageHeroes/tidehunter_hphover.png"));
				GetImageHero.Lycan = ImageIO.read(new File(
						"imageHeroes/lycan_hphover.png"));
				GetImageHero.Riki = ImageIO.read(new File(
						"imageHeroes/riki_hphover.png"));
				GetImageHero.Weaver = ImageIO.read(new File(
						"imageHeroes/weaver_hphover.png"));
				GetImageHero.Batrider = ImageIO.read(new File(
						"imageHeroes/batrider_hphover.png"));
				GetImageHero.Lich = ImageIO.read(new File(
						"imageHeroes/lich_hphover.png"));
				GetImageHero.Pudge = ImageIO.read(new File(
						"imageHeroes/pudge_hphover.png"));
				GetImageHero.ElderTitan = ImageIO.read(new File(
						"imageHeroes/elder_titan_hphover.png"));
				GetImageHero.Venomancer = ImageIO.read(new File(
						"imageHeroes/venomancer_hphover.png"));
				GetImageHero.PhantomAssassin = ImageIO.read(new File(
						"imageHeroes/phantom_assassin_hphover.png"));
				GetImageHero.ObsidianDestroyer = ImageIO.read(new File(
						"imageHeroes/obsidian_destroyer_hphover.png"));
				GetImageHero.Zuus = ImageIO.read(new File(
						"imageHeroes/zuus_hphover.png"));

			} catch (IOException e) {
			}
		}

		@Override
		public void paint(Graphics g) {
			super.paintComponents(g);
			g.drawImage(Axe, 10, 55, null);
			g.drawImage(Abaddon, 147, 55, null);
			g.drawImage(AntiMage, 284, 55, null);
			g.drawImage(Clinkz, 421, 55, null);
			g.drawImage(CrystalMaiden, 558, 55, null);
			g.drawImage(Silencer, 695, 55, null);
			g.drawImage(Huskar, 10, 142, null);
			g.drawImage(Bristleback, 147, 142, null);
			g.drawImage(Luna, 284, 142, null);
			g.drawImage(FacelessVoid, 421, 142, null);
			g.drawImage(SkywrathMage, 558, 142, null);
			g.drawImage(OgreMagi, 695, 142, null);
			g.drawImage(Beastmaster, 10, 224, null);
			g.drawImage(Omniknight, 147, 224, null);
			g.drawImage(Slark, 284, 224, null);
			g.drawImage(PhantomLancer, 421, 224, null);
			g.drawImage(QueenOfPain, 558, 224, null);
			g.drawImage(Dazzle, 695, 224, null);
			g.drawImage(Tidehunter, 10, 311, null);
			g.drawImage(Lycan, 147, 311, null);
			g.drawImage(Riki, 284, 311, null);
			g.drawImage(Weaver, 421, 311, null);
			g.drawImage(Batrider, 558, 311, null);
			g.drawImage(Lich, 695, 311, null);
			g.drawImage(Pudge, 10, 398, null);
			g.drawImage(ElderTitan, 147, 398, null);
			g.drawImage(Venomancer, 284, 398, null);
			g.drawImage(PhantomAssassin, 421, 398, null);
			g.drawImage(ObsidianDestroyer, 558, 398, null);
			g.drawImage(Zuus, 695, 398, null);

			g.drawRect(70, 25, 150, 25);
			g.drawString("STRENGTH", 115, 42);
			g.drawRect(335, 25, 150, 25);
			g.drawString("AGILITY", 385, 42);
			g.drawRect(610, 25, 150, 25);
			g.drawString("INTELLIGENCE", 645, 42);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

}