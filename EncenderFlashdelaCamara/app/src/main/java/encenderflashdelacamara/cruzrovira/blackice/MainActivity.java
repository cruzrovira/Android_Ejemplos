package encenderflashdelacamara.cruzrovira.blackice;

import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFlashCamara;
    Camera camera;
    boolean statusCAmera = false; // Estado de camara apagada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFlashCamara=(Button) findViewById(R.id.btnFlashCamara);
        btnFlashCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(statusCAmera == false){
                    camera = Camera.open();
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);

                    camera.setParameters(parameters);
                    camera.startPreview();
                    statusCAmera = true;
                    btnFlashCamara.setText("Apagar Flash Camara");
                }else{
                    camera.stopPreview();
                    camera.release();
                    btnFlashCamara.setText("Encender Flash Camara");
                }

            }
        });
    }
}
