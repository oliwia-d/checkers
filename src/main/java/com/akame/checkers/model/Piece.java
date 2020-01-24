package com.akame.checkers.model;

import com.akame.checkers.types.PieceType;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

import static com.akame.checkers.Game.TILE_SIZE;

public class Piece extends StackPane {

    private PieceType type;

    public PieceType getType() {
        return type;
    }

    public Piece(PieceType type, int x, int y) {
        this.type = type;

        relocate(x * TILE_SIZE, y * TILE_SIZE);

        double ellipseX = TILE_SIZE * 0.3125;
        double ellipseY = TILE_SIZE * 0.26;

        Ellipse bg = new Ellipse(ellipseX, ellipseY);
        bg.setFill(Color.BLACK);

        bg.setStroke(Color.BLACK);
        bg.setStrokeWidth(TILE_SIZE * 0.03);

        bg.setTranslateX(TILE_SIZE / 2. - ellipseX);
        bg.setTranslateY(TILE_SIZE / 2. - ellipseY + 0.1 * TILE_SIZE);

        Ellipse ellipse = new Ellipse(ellipseX, ellipseY);

        ellipse.setFill(type == PieceType.RED ?
                Color.valueOf("#c40003") : Color.valueOf("#fff9f4"));

        ellipse.setTranslateX(TILE_SIZE / 2. - ellipseX);
        ellipse.setTranslateY(TILE_SIZE / 2. - ellipseY);

        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(TILE_SIZE * 0.03);

        getChildren().addAll(bg, ellipse);
    }
}
