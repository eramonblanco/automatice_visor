package pe.visorweb.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pe.visorweb.paginas.categoria.PaginaMantenimientoCategoria;

public class MenuPrincipal {

	@FindBy(xpath = "//div[@class=\"menu\"]/div[1]")
	private WebElement menuHamburguesa;
	
	@FindBy(xpath = "//span[contains(text(), \"Mod. de Almac&eacute;n\")]")
	private WebElement menuModuloAlmacen;
	
	@FindBy(linkText = "Mnt. de Categoría")
	private WebElement menuMantenimientoCategoria;
	
	private WebDriver driver;
	
	public MenuPrincipal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PaginaMantenimientoCategoria cargarPaginaMantenimientoCategoria() throws InterruptedException {
		
		Thread.sleep(1000);
		menuHamburguesa.click();
		
		Thread.sleep(1000);
		menuModuloAlmacen.click();
		
		Thread.sleep(1000);
		menuMantenimientoCategoria.click();
		
		return new PaginaMantenimientoCategoria(driver);
		
	}
	
}
