package ui;

class Paths
{

	public static final String LOGIN_FXML = "/fxml/Login.fxml";
	public static final String DIRECTORY_FXML = "/fxml/Directory.fxml";
	public static final String MAP_FXML = "/fxml/Map.fxml";
	public static final String MAP_EDITOR_FXML = "/fxml/MapEditorTool.fxml";
	public static final String PROVIDER_BOX_FXML = "/fxml/ProviderBox.fxml";
	public static final String STARTUP_FXML = "/fxml/Startup.fxml";
	public static final String ADMIN_PAGE_FXML = "/fxml/AdminPage.fxml";
	public static final String DIRECTORY2_FXML = "/fxml/Directory2.fxml";

	public static final String FLOOR1_NORMAL = "/Floors/floor1ColorScheme.png";
	public static final String FLOOR2_NORMAL = "/Floors/floor2ColorScheme.png";
	public static final String FLOOR3_NORMAL = "/Floors/floor3ColorScheme.png";
	public static final String FLOOR4_NORMAL = "/Floors/floor4ColorScheme.png";
	public static final String FLOOR5_NORMAL = "/Floors/floor5ColorSchemeNoLines.png";
	public static final String FLOOR6_NORMAL = "/Floors/floor6ColorSchemeNoLines.png";
	public static final String FLOOR7_NORMAL = "/Floors/floor7ColorSchemeNoLines.png";

	public static final String FLOOR1_CONTRAST = "/Floors/floor1Contrast.png";
	public static final String FLOOR2_CONTRAST = "/Floors/floor2Contrast.png";
	public static final String FLOOR3_CONTRAST = "/Floors/floor3Contrast.png";
	public static final String FLOOR4_CONTRAST = "/Floors/floor4Contrast.png";
	public static final String FLOOR5_CONTRAST = "/Floors/floor5Contrast.png";
	public static final String FLOOR6_CONTRAST = "/Floors/floor6Contrast.png";
	public static final String FLOOR7_CONTRAST = "/Floors/floor7Contrast.png";


	public static final String HALLWAYICON = "/images/nodeIcon.png";
	public static final String ELEVATORICON = "/images/ElevatorIcon.png";
	public static final String DOCTORICON = "/images/DoctorIcon2.png";
	public static final String RESTROOMICON = "/images/UniRestroomIcon.png";
	public static final String ADDNODE = "/images/addNodeSmall.png";
	public static final String REMOVENEIGHBOR = "/images/RemoveConnectionSmall.png";
	public static final String REMOVENODE = "/images/removeNodeSmall.png";
	public static final String CHAINNODES = "/images/chainNodeSmall.png";

	// Make proxyimages to store floor pictures
	public static ProxyImage f1ImageProxy = new ProxyImage(Paths.FLOOR1_NORMAL);
	public static ProxyImage f2ImageProxy = new ProxyImage(Paths.FLOOR2_NORMAL);
	public static ProxyImage f3ImageProxy = new ProxyImage(Paths.FLOOR3_NORMAL);
	public static ProxyImage f4ImageProxy = new ProxyImage(Paths.FLOOR4_NORMAL);
	public static ProxyImage f5ImageProxy = new ProxyImage(Paths.FLOOR5_NORMAL);
	public static ProxyImage f6ImageProxy = new ProxyImage(Paths.FLOOR6_NORMAL);
	public static ProxyImage f7ImageProxy = new ProxyImage(Paths.FLOOR7_NORMAL);

	public static ProxyImage[] regularFloorImages =
			{
					f1ImageProxy, f2ImageProxy, f3ImageProxy, f4ImageProxy, f5ImageProxy, f6ImageProxy, f7ImageProxy
			};

	public static ProxyImage f1ContrastProxy = new ProxyImage(Paths.FLOOR1_CONTRAST);
	public static ProxyImage f2ContrastProxy = new ProxyImage(Paths.FLOOR2_CONTRAST);
	public static ProxyImage f3ContrastProxy = new ProxyImage(Paths.FLOOR3_CONTRAST);
	public static ProxyImage f4ContrastProxy = new ProxyImage(Paths.FLOOR4_CONTRAST);
	public static ProxyImage f5ContrastProxy = new ProxyImage(Paths.FLOOR5_CONTRAST);
	public static ProxyImage f6ContrastProxy = new ProxyImage(Paths.FLOOR6_CONTRAST);
	public static ProxyImage f7ContrastProxy = new ProxyImage(Paths.FLOOR7_CONTRAST);

	public static ProxyImage[] contrastFloorImages =
			{
					f1ContrastProxy, f2ContrastProxy, f3ContrastProxy, f4ContrastProxy, f5ContrastProxy, f6ContrastProxy, f7ContrastProxy
			};

	// Make proxyimages for icons
	public static ProxyImage removeNodeImageProxy = new ProxyImage(Paths.REMOVENODE);
	public static ProxyImage chainImageProxy = new ProxyImage(Paths.CHAINNODES);
	public static ProxyImage addNeighborImageProxy = new ProxyImage(Paths.ADDNODE);
	public static ProxyImage removeNeighborImageProxy = new ProxyImage(Paths.REMOVENEIGHBOR);
	public static ProxyImage doctorImageProxy = new ProxyImage(Paths.DOCTORICON);
	public static ProxyImage restroomImageProxy = new ProxyImage(Paths.RESTROOMICON);
	public static ProxyImage elevatorImageProxy = new ProxyImage(Paths.ELEVATORICON);
	public static ProxyImage hallwayImageProxy = new ProxyImage(Paths.HALLWAYICON);
}
