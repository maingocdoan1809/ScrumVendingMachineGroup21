/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Command.SystemCommand;

import Models.Observer.Observer;
import Views.Recharge;

/**
 *
 * @author Admin
 */

 // Command cho việc đăng nhập tài khoản.
public class RechargeCommand extends SystemCommand{
    
    private Observer caller;

    public RechargeCommand(Observer caller) {
        this.caller = caller;
    }

    @Override
    public void execute() {
        // tạo và hiển thị form đăng nhập
        Recharge l = new Recharge();
        l.register(caller);
        l.setVisible(true);
    }
    
}
