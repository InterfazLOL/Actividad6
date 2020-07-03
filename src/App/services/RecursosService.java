package services;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;

public class RecursosService {

    private static RecursosService servicio;
    private Color colorFndoIzq, colorFndoCampos, colorFont, colorFontOp, colorBtnIngresar, colorAzulFondo, 
        colorAzulFondoLateral, colorFndoJuega, colorHerramientas;
    private Font fontPrincipal, fontSecundaria, fontPer;
    private Cursor cMano;
    
    private RecursosService() {
        colorFndoIzq = new Color(249, 249, 249);
        colorFndoCampos = new Color(237, 237, 237);
        colorFont = new Color(0, 0, 0);
        colorFontOp = new Color(0, 0, 0, 80);
        colorBtnIngresar = new Color(209, 54, 57);
        colorAzulFondo = new Color(2, 4, 7);
        colorAzulFondoLateral = new Color(1, 10, 19);
        colorFndoJuega = new Color(30, 35, 40);
        colorHerramientas = new Color(205, 190, 145);
        fontPrincipal = new Font("Typold Condensed Medium", Font.BOLD, 22);
        fontSecundaria = new Font("Typold Condensed Medium", Font.BOLD, 11);
        fontPer = new Font("Typold Condensed Medium", Font.BOLD, 13);
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }
    
    public static RecursosService getService(){
        if(servicio==null)
            servicio = new RecursosService();
        return servicio;
    }

    public Color getColorFndoIzq() {
        return colorFndoIzq;
    }

    public Color getColorFndoCampos() {
        return colorFndoCampos;
    }

    public Color getColorFont() {
        return colorFont;
    }

    public Color getColorFontOp() {
        return colorFontOp;
    }

    public Color getColorAzulFondo() {
        return colorAzulFondo;
    }

    public Color getColorAzulFondoLateral() {
        return colorAzulFondoLateral;
    }

    public Font getFontPrincipal() {
        return fontPrincipal;
    }

    public Font getFontSecundaria() {
        return fontSecundaria;
    }

    public Font getFontPer() {
        return fontPer;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public Color getColorBtnIngresar(){
        return colorBtnIngresar;
    }

    public Color getColorFndoJuega() {
        return colorFndoJuega;
    }

    public Color getColorHerramietas() {
        return colorHerramientas;
    }
}