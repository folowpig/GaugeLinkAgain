package gl;

//comment
import eu.hansolo.steelseries.tools.LedColor;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import gl.Circle;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class gaugeForm extends javax.swing.JFrame {

    /**
     * Creates new form gaugeForm
     */
    
    // x is RPM, will change in the future.
    int x = 0;
    double speedNum = 0;
    int boost = 0, currentGear = 1;
    String gearIncrease, gearDecrease, speedIncrease, speedDecrease, rpmIncrease, rpmDecrease, boostIncrease, boostDecrease;
    boolean isEconomic = true;
    boolean isStart = false;
    gauge Shift_ind;
    ImageIcon leaf = new ImageIcon("leafMode.png");
    ImageIcon flag = new ImageIcon("Flag mode.png");
    
    public gaugeForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        shiftUpButton = new javax.swing.JButton();
        shiftDownButton = new javax.swing.JButton();
        throttleButton = new javax.swing.JButton();
        psiLabel = new javax.swing.JLabel();
        boostLabel = new javax.swing.JLabel();
        rpm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gearNumber = new javax.swing.JLabel();
        currentGearLabel = new javax.swing.JLabel();
        checkShiftLabel = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shiftTell = new javax.swing.JLabel();
        vtecdisplay = new javax.swing.JLabel();
        ModePic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gl/stop_button.png"))); // NOI18N
        startButton.setToolTipText("Start car");
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/gl/start_button.png.png"))); // NOI18N
        startButton.setFocusPainted(false);
        startButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gl/pressed_button.png"))); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        shiftUpButton.setText("Shift up");
        shiftUpButton.setToolTipText("Change gear up (go faster)");
        shiftUpButton.setEnabled(false);
        shiftUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftUpButtonMouseClicked(evt);
            }
        });
        shiftUpButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                shiftUpButtonKeyPressed(evt);
            }
        });

        shiftDownButton.setText("Shift Down");
        shiftDownButton.setEnabled(false);
        shiftDownButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftDownButtonMouseClicked(evt);
            }
        });
        shiftDownButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                shiftDownButtonKeyPressed(evt);
            }
        });

        throttleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gl/pedalN.png"))); // NOI18N
        throttleButton.setToolTipText("Accelerate");
        throttleButton.setBorderPainted(false);
        throttleButton.setContentAreaFilled(false);
        throttleButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/gl/pedalN.png"))); // NOI18N
        throttleButton.setEnabled(false);
        throttleButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gl/pedalY.png"))); // NOI18N
        throttleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                throttleButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                throttleButtonMouseReleased(evt);
            }
        });
        throttleButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                throttleButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                throttleButtonKeyReleased(evt);
            }
        });

        psiLabel.setText("PSI");
        psiLabel.setToolTipText("(Pounds per square inch)");

        boostLabel.setText("Boost");
        boostLabel.setToolTipText("Turbo pressure");
        boostLabel.setName("Boost"); // NOI18N

        rpm.setText("RPM");
        rpm.setToolTipText("Engine Speed measured in rotations per minute");

        jLabel4.setText("Tachometer");
        jLabel4.setToolTipText("Engine Speed measured in rotations per minute");

        gearNumber.setText("1");
        gearNumber.setToolTipText("Determines moving speed (MPH) and engine speed (RPM)");

        currentGearLabel.setText("Current Gear");
        currentGearLabel.setToolTipText("Determines moving speed (MPH) and engine speed (RPM)");

        checkShiftLabel.setText("Shift");

        speed.setText("MPH");
        speed.setToolTipText("Speed in Miles Per Hour");

        jLabel3.setText("Speedometer");
        jLabel3.setToolTipText("Moving speed of the car");

        mode.setText("Economic");
        mode.setEnabled(false);
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });

        jLabel1.setText(" Mode:");

        shiftTell.setText("                   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(shiftUpButton)
                .addGap(27, 27, 27)
                .addComponent(shiftDownButton)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftTell)
                    .addComponent(throttleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(292, 452, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gearNumber)
                        .addGap(79, 79, 79)
                        .addComponent(rpm)
                        .addGap(79, 79, 79)
                        .addComponent(speed)
                        .addGap(52, 52, 52)
                        .addComponent(psiLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(ModePic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vtecdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentGearLabel))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(boostLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(checkShiftLabel)))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(mode))
                        .addGap(27, 27, 27)
                        .addComponent(checkShiftLabel)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ModePic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(shiftTell)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vtecdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gearNumber)
                                    .addComponent(rpm)))
                            .addComponent(throttleButton)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(shiftUpButton)
                                .addComponent(shiftDownButton))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentGearLabel)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(boostLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speed)
                            .addComponent(psiLabel)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(953, 953, 953)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean mouseDown = false;
    private void throttleButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_throttleButtonMousePressed
        // TODO add your handling code here:
        //--------------->>>>>>>>>>> when mouse is clicked in.
        if(isStart){
            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            mouseDown = true;
            initThread();
        }
    }
    }//GEN-LAST:event_throttleButtonMousePressed

    private void throttleButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_throttleButtonMouseReleased
        // TODO add your handling code here:
        //---------------->>>>>>>>>> when mouse is released
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        mouseDown = false;
        //initThread();
    }
    }//GEN-LAST:event_throttleButtonMouseReleased

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        // ----------->>>>>>>>>>> initialize values
        if(isStart)
        {
            startButton.setIcon(new ImageIcon(getClass().getResource("/gl/stop_button.png")));
            mouseDown = false;
            stopValues();
        }
        else{
                startButton.setIcon(new ImageIcon(getClass().getResource("/gl/start_button.png.png")));
                startValues();
            }
    }//GEN-LAST:event_startButtonActionPerformed

    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
        // TODO add your handling code here:
        if(isEconomic)
        {
            isEconomic = false;
            ModePic.setIcon(flag);
            mode.setText("Performance");
        }
        else
        {
            isEconomic = true;
            ModePic.setIcon(leaf);
            mode.setText("Economic");
        }
    }//GEN-LAST:event_modeActionPerformed

    private void shiftUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftUpButtonMouseClicked
        // TODO add your handling code here:
        // Max gear is 6
        if(isStart){
            checkShift(x,isEconomic);
            if (currentGear <= 5){
                //x-=1000;
                x = changeUp(x);
                currentGear+=1;
                gearIncrease=Integer.toString(currentGear);
                gearNumber.setText(gearIncrease);
            }
        }
    }//GEN-LAST:event_shiftUpButtonMouseClicked

    private void shiftDownButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftDownButtonMouseClicked
        // TODO add your handling code here:
        if(isStart){
            if (currentGear >= 2){
               x+=1000;
               currentGear-=1;
               gearDecrease=Integer.toString(currentGear);
               gearNumber.setText(gearDecrease);
           }
        }
        
    }//GEN-LAST:event_shiftDownButtonMouseClicked

    private void shiftUpButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shiftUpButtonKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_A){      
        
        checkShift(x,isEconomic);
        if (currentGear <= 5){
            //x-=1000;
            x = changeUp(x);
            currentGear+=1;
            gearIncrease=Integer.toString(currentGear);
            gearNumber.setText(gearIncrease);
        }
        }
    }//GEN-LAST:event_shiftUpButtonKeyPressed

    private void shiftDownButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shiftDownButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_Z){   
            if (currentGear >= 2){
           x+=1000;
           currentGear-=1;
           gearDecrease=Integer.toString(currentGear);
           gearNumber.setText(gearDecrease);
       }
            
        }
    }//GEN-LAST:event_shiftDownButtonKeyPressed

    private void throttleButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_throttleButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_A){
        checkShift(x,isEconomic);
            if (currentGear <= 5){
               // x-=1000;
                x = changeUp(x);
                currentGear+=1;
                gearIncrease=Integer.toString(currentGear);
                gearNumber.setText(gearIncrease);
            }
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_Z){   
            if (currentGear >= 2){
                //x+=1000;
                x = changeDown(x);
                currentGear-=1;
                gearDecrease=Integer.toString(currentGear);
                gearNumber.setText(gearDecrease);
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_SHIFT){
            mouseDown = true;
            throttleButton.setIcon(new ImageIcon("pedalY.png"));
            initThread();
        }
            
    }//GEN-LAST:event_throttleButtonKeyPressed

    private void throttleButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_throttleButtonKeyReleased
        // TODO add your handling code here:
        mouseDown = false;
    }//GEN-LAST:event_throttleButtonKeyReleased
    public void keyPressed(KeyEvent e){
        if(e.getKeyChar() == 'a'){
        checkShift(x,isEconomic);
            if (currentGear <= 5){
                x-=1000;
                currentGear+=1;
                gearIncrease=Integer.toString(currentGear);
                gearNumber.setText(gearIncrease);
            }
        }
        
        if(e.getKeyChar() == 'z'){   
            if (currentGear >= 2){
                x+=1000;
                currentGear-=1;
                gearDecrease=Integer.toString(currentGear);
                gearNumber.setText(gearDecrease);
            }
        }
    }
private boolean isRunning = false;
private synchronized boolean checkAndMark() {
    if (isRunning) return false;
    isRunning = true;
    return true;
}


// creates a thread in run time
private void initThread() {
    if (checkAndMark()) {
        new Thread() {
            public void run() {
                do {
                    //sleeps the system, so that we dont build the values too fast
                    goToSleep(30);
                    
                    // checks to display vtec
                    x = isVtec(x);
                    // checks rev limit, 
                    x = isRevLimit(x);
                    
                    // increment speed and display
                    speedNum = x * currentGear *0.0043021;
                    speedNum = Math.round(speedNum * 100.0) / 100.0;
                    speedIncrease = Double.toString(speedNum);
                    speed.setText(speedIncrease + " MPH");
                    /*
                   if ((currentGear == 1) && (speedNum < 45)){
                    speedNum=speedNum+.5;
                    speedIncrease = Double.toString(speedNum);
                    speed.setText(speedIncrease + " MPH");
                   }
                   else if ((currentGear == 2) && (speedNum < 60)){
                    speedNum=speedNum+.5;
                    speedIncrease = Double.toString(speedNum);
                    speed.setText(speedIncrease + " MPH");
                   }
                    */
              
                    // RPM increase
                    x = x + 100/currentGear;  
                    rpmIncrease = Integer.toString(x);
                    rpm.setText(rpmIncrease + " RPM");
                    
                    //increase boost with a limit of 20
                    boost++;
                    boostIncrease = Integer.toString(boost);
                    psiLabel.setText(boostIncrease + " PSI");
                    
                    isBoost(boost);
                    isVacuum(boost);
                    
                    boost = isBoostLimit(boost);
                    
                    shiftTell(x);
                    
                    
                } while (mouseDown);
                isRunning = false;
                throttleButton.setIcon(new ImageIcon("pedalN.png"));
                // once the mouse is released, this loop is entered.
                    do {
                        //sleep so it doesn't decrease topo quickly
                        goToSleep(30);
                        
                        //disable the loop once all of the parameters have been met.
                        if (!isStart){
                               System.out.println("stopped!");
                        break;
                        }
                        
                        //decrement the RPM
                        x-=50;
                        // decrease the RPM
                        rpmDecrease = Integer.toString(x);
                        rpm.setText(rpmDecrease + " RPM");
                        
                        
                        // decrease speed.
                        speedNum = x * currentGear *0.0043021;
                        speedNum = Math.round(speedNum * 100.0) / 100.0;
                        speedDecrease = Double.toString(speedNum);
                        speed.setText(speedDecrease + " MPH");
                        
                        // to synchronize, forces speed to only have a min value of 0
                        if(speedNum < 0){
                            speedNum = 0;
                            speedDecrease = Double.toString(speedNum);
                            speed.setText(speedDecrease + " MPH");
                        }
                        
                        
                        
                        //vtec remove once dropped out of 5000
                        if (x < 5000)
                            vtecdisplay.setText("");
                      
                        // minimum RPM is 800
                        if (x <= 800) {
                            x=800;
                            rpmDecrease = Integer.toString(x);
                            rpm.setText(rpmDecrease + " RPM");
                        } 
                        
                        // calculate fuel used and distance covered
                                                
                        
                        // check if race is done
                        
                        
                        
                        // decrement boost, only allow for -25
                        boost--;
                        boostDecrease = Integer.toString(boost);
                        psiLabel.setText(boostDecrease + " PSI");
                        isBoost(boost);
                        isVacuum(boost);
                        boost = isBoostLimitNeg(boost);
                        
                        shiftTell(x);
                        
                        // to exit loop when min reached disable comment:
                        /*
                        if (boost <=- 25 && x <= 800){
                           break;
                        }
                        */
                        
                        
                    }while (mouseDown == false);
                
                  
            }
        }.start();
    }
}

private void startValues(){
        x=800;
        boost = -25;
        speed.setText("0 MPH");
        psiLabel.setText("-25 PSI");
        boostLabel.setText("Vacuum");
        rpm.setText("800 RPM");
        mode.setEnabled(true);
        throttleButton.setEnabled(true);
        shiftUpButton.setEnabled(true);
        shiftDownButton.setEnabled(true);
        //startButton.setEnabled(true);
        
        if(isEconomic)
            ModePic.setIcon(leaf);
        else
            ModePic.setIcon(flag);
        isStart = true;
}
private void stopValues(){
        x=0;
        boost = 0;
        speed.setText("0 MPH");
        psiLabel.setText("0 PSI");
        boostLabel.setText("Vacuum");
        rpm.setText("0 RPM");
        mode.setEnabled(false);
        throttleButton.setEnabled(false);
        shiftUpButton.setEnabled(false);
        shiftDownButton.setEnabled(false);
        //startButton.setEnabled(true);
        
        ModePic.setIcon(new ImageIcon(""));
        //isEconomic = true;
        isStart = false;
}


private void goToSleep(int x){
    try {
        Thread.sleep(x);                //1000 milliseconds is one second.
    } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
}

private int changeUp(int RPM) {
    double temp;
    double tempGear;
    temp = (double)RPM;
    tempGear = (double)currentGear;
    temp = temp*(1 - Math.pow(.8,(tempGear+3)));
    return (int)temp;
}

private int changeDown(int RPM) {
    double temp;
    double tempGear;
    temp = (double)RPM;
    tempGear = (double)currentGear;
    temp = temp/(1 - Math.pow(.8,(tempGear+3)));
    if (temp > 9100) {
        checkShiftLabel.setText("You blew your engine! Let the RPM drop more before downshifting");
    }
    return (int)temp;
}
private void isBoost(int x){
    if (boost > 0){
        boostLabel.setText("Boost");
    }
}
private void isVacuum(int x){
    if (boost < 0){
        boostLabel.setText("Vacuum");
    }
}
public int isBoostLimit(int x){
    if (x > 20){
        x=20;
        psiLabel.setText("25 PSI");
    }
    return x;
}
public int isBoostLimitNeg(int x){
    if (x < -25){
        x = -25;
        psiLabel.setText("-25 PSI");
    }
    return x;
}
public int isRevLimit(int x){
    if (x > 9100) {
        x = 9100;
        rpm.setText("9100 RPM");
        goToSleep(50);
    }
    return x;
}

public double calcSpeed(int RPM, int gear)
{
    return RPM * gear * 0.0043021;
}


public int isVtec(int x){
    if (x > 5000) {
        vtecdisplay.setText("VTEC!");
        x += 100;
    }
    return x;
}

public void shiftTell(int x)
{
    if(!isEconomic)
    {
        if(x > 9000)
        {
            Shift_ind.rpmGauge.setLedColor(LedColor.GREEN_LED);
            shiftTell.setText("Shift Up");
        }
        else
            Shift_ind.rpmGauge.setLedColor(LedColor.RED_LED);
            shiftTell.setText("");
    }    
    else
    {
        if(x > 2500)
        {
            Shift_ind.rpmGauge.setLedColor(LedColor.GREEN_LED);
            shiftTell.setText("Shift Up");
        }
        else
            Shift_ind.rpmGauge.setLedColor(LedColor.RED_LED);
            shiftTell.setText("");
    }
}


private void checkShift(int x, boolean eco){
    
    if(x < 1800 && eco)
        checkShiftLabel.setText("Early shift.");
    else if(x > 1800 && x < 2500 && eco)
        checkShiftLabel.setText("Good economic shift!");
    else if (x > 2500 && eco)
        checkShiftLabel.setText("Late shift.");
    
    if(x < 8500 && !eco)
         checkShiftLabel.setText("Early shift. (Too soon junior!)");
    if(x > 8500 && x < 9200 && !eco)
         checkShiftLabel.setText("Good performance shift!");

}


    
private void increment(int x){
    
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gaugeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gaugeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gaugeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gaugeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gaugeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ModePic;
    private javax.swing.JLabel boostLabel;
    private javax.swing.JLabel checkShiftLabel;
    private javax.swing.JLabel currentGearLabel;
    private javax.swing.JLabel gearNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mode;
    private javax.swing.JLabel psiLabel;
    private javax.swing.JLabel rpm;
    private javax.swing.JButton shiftDownButton;
    private javax.swing.JLabel shiftTell;
    private javax.swing.JButton shiftUpButton;
    private javax.swing.JLabel speed;
    private javax.swing.JButton startButton;
    private javax.swing.JButton throttleButton;
    private javax.swing.JLabel vtecdisplay;
    // End of variables declaration//GEN-END:variables
}
