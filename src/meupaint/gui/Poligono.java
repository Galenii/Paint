/*
 * Copyright (C) 2023 Guilherme Galeni
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package meupaint.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Path2D;

/**
 * Uma Elipse.
 * 
 * @author Guilherme Galeni
 */
public class Poligono extends FormaGeometrica {
    
    private int quantidadeLados;
    private int raio;
    private double angulo;

    @Override
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        Point[] pontos = new Point[quantidadeLados];
        double incremento = 360.0 / quantidadeLados;
        
        g2d.setColor(Color.black);
        
        for( int i = 0; i < quantidadeLados; i++){
            double anguloR = Math.toRadians( angulo );
            int px = xIni + (int) (Math.cos( anguloR ) * raio );
            int py = yIni + (int) (Math.sin( anguloR ) * raio );
            Point novoPonto = new Point (px , py);
            pontos[i] = novoPonto;
            angulo += incremento;
        }
        
        Path2D.Double caminho = new Path2D.Double();
        caminho.moveTo( pontos[0].x, pontos[0].y );
        
        for( int i = 1 ; i < quantidadeLados ; i++){
            caminho.lineTo( pontos[i].x , pontos[i].y );
           
        }
        g2d.setColor(corPreenchimento);
        caminho.closePath();
        g2d.draw( caminho );
        g2d.fill( caminho );
        g2d.setColor( corContorno );
        g2d.draw( caminho );
        
        g2d.dispose();
        
    }

    public int getQuantidadeLados() {
        return quantidadeLados;
    }

    public void setQuantidadeLados(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    
    
}
