package com.kuaifang.entity;

import java.util.List;

/**
 * Description： 首页数据源的实体类<br/>
 * Copyright (c)  2016 <br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月17  11:23
 *
 * @author 张晶波
 * @version : 1.0
 */
public class FirstPage {

    /**
     * GX :
     * CS :
     * KF : {"TL":"药师咨询","PY":"4008-699-591","YYMC":"药师咨询专线","YYTEL":"4008-239-339","XXTS":"满18元免运费","PYO":"","GN":"","CJ":3,"GJZ":[{"KN":"感冒","PC":"http://p2.kfyao.com/kn/kn2016102915021241457.png"},{"KN":"口罩","PC":"http://p2.kfyao.com/kn/kn2016110708530147442.png"},{"KN":"咳嗽","PC":"http://p2.kfyao.com/kn/kn2016102915013362647.png"},{"KN":"滴眼液","PC":"http://p2.kfyao.com/kn/kn2016102914582675589.png"},{"KN":"清热解毒","PC":"http://p2.kfyao.com/kn/kn2016102914585192397.png"},{"KN":"妇科","PC":"http://p2.kfyao.com/kn/kn2016110116523438112.png"},{"KN":"膏药","PC":"http://p2.kfyao.com/kn/kn2016102914561988648.png"}]}
     * SY : {"ID":0,"TL":0,"PY":0,"ADTJ":"http://okm.kfyao.com/v3/images/ad/tj1009.jpg","ADPP":"http://okm.kfyao.com/v3/images/ad/ppad4.jpg","ADYY":"","ADZY":"","ADTJ2":"http://okm.kfyao.com/v3/images/ad/tj1009.jpg","ADPP2":"http://okm.kfyao.com/v3/images/ad/ppad4.jpg","ADYY2":"","ADZY2":"","GN":null,"CJ":"","MNO":"","NT":""}
     * WZ : {"TL":"购物车","PY":"购物","PYO":"订单","CF":"药师咨询","CJ":"<center><font color='#A4A4A4'>互联网药品交易服务资格证书：京C2016002<\/font><\/center>"}
     * MU :
     * SYSJ : [{"ID":1,"MM":{"TJ":{"BARPC":"http://okm.kfyao.com/v3/images/tj/tj02.jpg","BARPC2":"http://okm.kfyao.com/v3/images/tj/top3.jpg","BARURL":"http://okm.kfyao.com/v3/tj.php?tl=特价活动","TJMM":[{"URL":"http://okm.kfyao.com/v3/images/tj/15513.jpg","PID":15513},{"URL":"http://okm.kfyao.com/v3/images/tj/13365_3.jpg","PID":13365},{"URL":"http://okm.kfyao.com/v3/images/tj/7538_3.jpg","PID":7538},{"URL":"http://okm.kfyao.com/v3/images/tj/1961_3.jpg","PID":1961}]},"ZT":{"TL":"主题特卖","MM":[{"PC":"http://p1.kfyao.com/66/73/6673161110141432929_1080_460_.jpg","ZID":"10","URL":"http://okm.kfyao.com/v3/ztl.php?tl=双11狂欢购"},{"PC":"http://p1.kfyao.com/41/94/4194161108114303683_1080_460_.jpg","ZID":"2","URL":"http://okm.kfyao.com/v3/ztl.php?tl=雾霾专题"}],"URL":"http://okm.kfyao.com/v3/zt.php?tl=主题特卖"},"PP":{"TL":"品牌推荐","MM":[{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=云南白药","PC":"http://okm.kfyao.com/v3/images/pp/2.png","ZID":"2","TL":"云南白药"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=桂龙药业","PC":"http://okm.kfyao.com/v3/images/pp/9.png","ZID":"9","TL":"桂龙药业"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=白云山","PC":"http://okm.kfyao.com/v3/images/pp/4.png","ZID":"4","TL":"白云山"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=华润三九","PC":"http://okm.kfyao.com/v3/images/pp/3.png","ZID":"3","TL":"华润三九"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=杜蕾斯","PC":"http://okm.kfyao.com/v3/images/pp/5.png","ZID":"5","TL":"杜蕾斯"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=九芝堂","PC":"http://okm.kfyao.com/v3/images/pp/6.png","ZID":"6","TL":"九芝堂"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=贵州百灵","PC":"http://okm.kfyao.com/v3/images/pp/7.png","ZID":"7","TL":"贵州百灵"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=哈药集团","PC":"http://okm.kfyao.com/v3/images/pp/8.png","ZID":"8","TL":"哈药集团"}],"URL":"http://okm.kfyao.com/v3/pp.php?tl=品牌推荐"},"JJTJ":{"TL":"当季热销商品","PC":"http://okm.kfyao.com/v3/images/jj/jjbj.png","MM":[{"PID":2864,"TL":"[白云山] 板蓝根颗粒","PC":"http://p1.kfyao.com/60/34/6034140617160400992.jpg","MS":"10gx20袋 含蔗糖","MM":"清热解毒，凉血利咽。用于肺胃热盛所致的咽喉肿痛、口咽干燥；急性扁桃体炎见上述证候者。","PR":"10.60"},{"PID":7614,"TL":"慢严舒柠咽炎片","PC":"http://p1.kfyao.com/67/86/6786160519100541613.jpg","MS":"0.25gx15片x2板（换包装啦，新老包装随机发）","MM":"养阴润肺，清热解毒，清利咽喉，镇咳止痒。用于慢性咽炎引起咽干，咽痒，刺激性咳嗽。","PR":"12.80"},{"PID":469,"TL":"[感康] 感康","PC":"http://p1.kfyao.com/48/22/4822161020174442423.jpg","MS":"12片","MM":"适用于缓解普通感冒及流行性感冒引起的发热、头痛、四肢酸痛、打喷嚏、流鼻涕、鼻塞、咽痛等症状。","PR":"12.80"},{"PID":12361,"TL":"[标婷] 标婷维生素E乳","PC":"http://p1.kfyao.com/71/59/7159161025105344337.jpg","MS":"100g（喷头式）","MM":"用于皮肤干燥并有润肤、保湿作用。","PR":"9.60"},{"PID":3560,"TL":"[扬子江] 蓝芩口服液","PC":"http://p1.kfyao.com/89/19/8919160425093406836.jpg","MS":"10mlX6支","MM":"清热解毒，利咽消肿。用于急性咽炎、肺胃实热证所致的咽痛、咽干、咽部灼热。","PR":"18.00"},{"PID":276,"TL":"[葵花药业] 小儿肺热咳喘口服液","PC":"http://p1.kfyao.com/87/30/8730160414154247818.jpg","MS":"10ml×6支","MM":"清热解毒，宣肺化痰。用于热邪犯于肺卫所致发热、汗出、微恶风寒、咳嗽、痰黄，或兼喘息、口干而渴。","PR":"26.50"},{"PID":3217,"TL":"[云南白药] 蒲地蓝消炎片","PC":"http://p1.kfyao.com/12/89/1289160424144959512.jpg","MS":"0.3克x24片x2板 薄膜衣片","MM":"清热解毒，抗炎消肿。用于疖肿、咽炎、扁桃腺炎。","PR":"12.00"},{"PID":3790,"TL":"[香港京都] 京都念慈菴蜜炼川贝枇杷膏","PC":"http://p1.kfyao.com/82/76/8276140905143541379.jpg","MS":"150ml","MM":"润肺化痰、止咳平喘、护喉利咽、生津补气、调心降火。本品适用于伤风咳嗽、痰稠、痰多气喘、咽喉干痒及声音嘶哑。","PR":"25.60"},{"PID":337,"TL":"[江中] 健胃消食片","PC":"http://p1.kfyao.com/40/27/4027160414152245227.jpg","MS":"0.8gx8片x4板 成人","MM":"健胃消食。用于脾胃虚弱所致的食积，症见不思饮食、嗳腐酸臭、脘腹胀满；消化不良见上述证候者。","PR":"7.60"},{"PID":6032,"TL":"[日本冈本] 冈本避孕套","PC":"http://p1.kfyao.com/50/69/5069160831125209765.jpg","MS":"3只/盒 超润滑","MM":"超润滑冈本避孕套","PR":"12.00"}]}}}]
     */

    private String GX;
    private String CS;
    private KFBean KF;
    private SYBean SY;
    private WZBean WZ;
    private String MU;
    private List<SYSJBean> SYSJ;

    public String getGX() {
        return GX;
    }

    public void setGX(String GX) {
        this.GX = GX;
    }

    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        this.CS = CS;
    }

    public KFBean getKF() {
        return KF;
    }

    public void setKF(KFBean KF) {
        this.KF = KF;
    }

    public SYBean getSY() {
        return SY;
    }

    public void setSY(SYBean SY) {
        this.SY = SY;
    }

    public WZBean getWZ() {
        return WZ;
    }

    public void setWZ(WZBean WZ) {
        this.WZ = WZ;
    }

    public String getMU() {
        return MU;
    }

    public void setMU(String MU) {
        this.MU = MU;
    }

    public List<SYSJBean> getSYSJ() {
        return SYSJ;
    }

    public void setSYSJ(List<SYSJBean> SYSJ) {
        this.SYSJ = SYSJ;
    }

    public static class KFBean {
        /**
         * TL : 药师咨询
         * PY : 4008-699-591
         * YYMC : 药师咨询专线
         * YYTEL : 4008-239-339
         * XXTS : 满18元免运费
         * PYO :
         * GN :
         * CJ : 3
         * GJZ : [{"KN":"感冒","PC":"http://p2.kfyao.com/kn/kn2016102915021241457.png"},{"KN":"口罩","PC":"http://p2.kfyao.com/kn/kn2016110708530147442.png"},{"KN":"咳嗽","PC":"http://p2.kfyao.com/kn/kn2016102915013362647.png"},{"KN":"滴眼液","PC":"http://p2.kfyao.com/kn/kn2016102914582675589.png"},{"KN":"清热解毒","PC":"http://p2.kfyao.com/kn/kn2016102914585192397.png"},{"KN":"妇科","PC":"http://p2.kfyao.com/kn/kn2016110116523438112.png"},{"KN":"膏药","PC":"http://p2.kfyao.com/kn/kn2016102914561988648.png"}]
         */

        private String TL;
        private String PY;
        private String YYMC;
        private String YYTEL;
        private String XXTS;
        private String PYO;
        private String GN;
        private int CJ;
        private List<GJZBean> GJZ;

        public String getTL() {
            return TL;
        }

        public void setTL(String TL) {
            this.TL = TL;
        }

        public String getPY() {
            return PY;
        }

        public void setPY(String PY) {
            this.PY = PY;
        }

        public String getYYMC() {
            return YYMC;
        }

        public void setYYMC(String YYMC) {
            this.YYMC = YYMC;
        }

        public String getYYTEL() {
            return YYTEL;
        }

        public void setYYTEL(String YYTEL) {
            this.YYTEL = YYTEL;
        }

        public String getXXTS() {
            return XXTS;
        }

        public void setXXTS(String XXTS) {
            this.XXTS = XXTS;
        }

        public String getPYO() {
            return PYO;
        }

        public void setPYO(String PYO) {
            this.PYO = PYO;
        }

        public String getGN() {
            return GN;
        }

        public void setGN(String GN) {
            this.GN = GN;
        }

        public int getCJ() {
            return CJ;
        }

        public void setCJ(int CJ) {
            this.CJ = CJ;
        }

        public List<GJZBean> getGJZ() {
            return GJZ;
        }

        public void setGJZ(List<GJZBean> GJZ) {
            this.GJZ = GJZ;
        }

        public static class GJZBean {
            /**
             * KN : 感冒
             * PC : http://p2.kfyao.com/kn/kn2016102915021241457.png
             */

            private String KN;
            private String PC;

            public String getKN() {
                return KN;
            }

            public void setKN(String KN) {
                this.KN = KN;
            }

            public String getPC() {
                return PC;
            }

            public void setPC(String PC) {
                this.PC = PC;
            }
        }
    }

    public static class SYBean {
        /**
         * ID : 0
         * TL : 0
         * PY : 0
         * ADTJ : http://okm.kfyao.com/v3/images/ad/tj1009.jpg
         * ADPP : http://okm.kfyao.com/v3/images/ad/ppad4.jpg
         * ADYY :
         * ADZY :
         * ADTJ2 : http://okm.kfyao.com/v3/images/ad/tj1009.jpg
         * ADPP2 : http://okm.kfyao.com/v3/images/ad/ppad4.jpg
         * ADYY2 :
         * ADZY2 :
         * GN : null
         * CJ :
         * MNO :
         * NT :
         */

        private int ID;
        private int TL;
        private int PY;
        private String ADTJ;
        private String ADPP;
        private String ADYY;
        private String ADZY;
        private String ADTJ2;
        private String ADPP2;
        private String ADYY2;
        private String ADZY2;
        private Object GN;
        private String CJ;
        private String MNO;
        private String NT;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getTL() {
            return TL;
        }

        public void setTL(int TL) {
            this.TL = TL;
        }

        public int getPY() {
            return PY;
        }

        public void setPY(int PY) {
            this.PY = PY;
        }

        public String getADTJ() {
            return ADTJ;
        }

        public void setADTJ(String ADTJ) {
            this.ADTJ = ADTJ;
        }

        public String getADPP() {
            return ADPP;
        }

        public void setADPP(String ADPP) {
            this.ADPP = ADPP;
        }

        public String getADYY() {
            return ADYY;
        }

        public void setADYY(String ADYY) {
            this.ADYY = ADYY;
        }

        public String getADZY() {
            return ADZY;
        }

        public void setADZY(String ADZY) {
            this.ADZY = ADZY;
        }

        public String getADTJ2() {
            return ADTJ2;
        }

        public void setADTJ2(String ADTJ2) {
            this.ADTJ2 = ADTJ2;
        }

        public String getADPP2() {
            return ADPP2;
        }

        public void setADPP2(String ADPP2) {
            this.ADPP2 = ADPP2;
        }

        public String getADYY2() {
            return ADYY2;
        }

        public void setADYY2(String ADYY2) {
            this.ADYY2 = ADYY2;
        }

        public String getADZY2() {
            return ADZY2;
        }

        public void setADZY2(String ADZY2) {
            this.ADZY2 = ADZY2;
        }

        public Object getGN() {
            return GN;
        }

        public void setGN(Object GN) {
            this.GN = GN;
        }

        public String getCJ() {
            return CJ;
        }

        public void setCJ(String CJ) {
            this.CJ = CJ;
        }

        public String getMNO() {
            return MNO;
        }

        public void setMNO(String MNO) {
            this.MNO = MNO;
        }

        public String getNT() {
            return NT;
        }

        public void setNT(String NT) {
            this.NT = NT;
        }
    }

    public static class WZBean {
        /**
         * TL : 购物车
         * PY : 购物
         * PYO : 订单
         * CF : 药师咨询
         * CJ : <center><font color='#A4A4A4'>互联网药品交易服务资格证书：京C2016002</font></center>
         */

        private String TL;
        private String PY;
        private String PYO;
        private String CF;
        private String CJ;

        public String getTL() {
            return TL;
        }

        public void setTL(String TL) {
            this.TL = TL;
        }

        public String getPY() {
            return PY;
        }

        public void setPY(String PY) {
            this.PY = PY;
        }

        public String getPYO() {
            return PYO;
        }

        public void setPYO(String PYO) {
            this.PYO = PYO;
        }

        public String getCF() {
            return CF;
        }

        public void setCF(String CF) {
            this.CF = CF;
        }

        public String getCJ() {
            return CJ;
        }

        public void setCJ(String CJ) {
            this.CJ = CJ;
        }
    }

    public static class SYSJBean {
        /**
         * ID : 1
         * MM : {"TJ":{"BARPC":"http://okm.kfyao.com/v3/images/tj/tj02.jpg","BARPC2":"http://okm.kfyao.com/v3/images/tj/top3.jpg","BARURL":"http://okm.kfyao.com/v3/tj.php?tl=特价活动","TJMM":[{"URL":"http://okm.kfyao.com/v3/images/tj/15513.jpg","PID":15513},{"URL":"http://okm.kfyao.com/v3/images/tj/13365_3.jpg","PID":13365},{"URL":"http://okm.kfyao.com/v3/images/tj/7538_3.jpg","PID":7538},{"URL":"http://okm.kfyao.com/v3/images/tj/1961_3.jpg","PID":1961}]},"ZT":{"TL":"主题特卖","MM":[{"PC":"http://p1.kfyao.com/66/73/6673161110141432929_1080_460_.jpg","ZID":"10","URL":"http://okm.kfyao.com/v3/ztl.php?tl=双11狂欢购"},{"PC":"http://p1.kfyao.com/41/94/4194161108114303683_1080_460_.jpg","ZID":"2","URL":"http://okm.kfyao.com/v3/ztl.php?tl=雾霾专题"}],"URL":"http://okm.kfyao.com/v3/zt.php?tl=主题特卖"},"PP":{"TL":"品牌推荐","MM":[{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=云南白药","PC":"http://okm.kfyao.com/v3/images/pp/2.png","ZID":"2","TL":"云南白药"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=桂龙药业","PC":"http://okm.kfyao.com/v3/images/pp/9.png","ZID":"9","TL":"桂龙药业"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=白云山","PC":"http://okm.kfyao.com/v3/images/pp/4.png","ZID":"4","TL":"白云山"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=华润三九","PC":"http://okm.kfyao.com/v3/images/pp/3.png","ZID":"3","TL":"华润三九"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=杜蕾斯","PC":"http://okm.kfyao.com/v3/images/pp/5.png","ZID":"5","TL":"杜蕾斯"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=九芝堂","PC":"http://okm.kfyao.com/v3/images/pp/6.png","ZID":"6","TL":"九芝堂"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=贵州百灵","PC":"http://okm.kfyao.com/v3/images/pp/7.png","ZID":"7","TL":"贵州百灵"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=哈药集团","PC":"http://okm.kfyao.com/v3/images/pp/8.png","ZID":"8","TL":"哈药集团"}],"URL":"http://okm.kfyao.com/v3/pp.php?tl=品牌推荐"},"JJTJ":{"TL":"当季热销商品","PC":"http://okm.kfyao.com/v3/images/jj/jjbj.png","MM":[{"PID":2864,"TL":"[白云山] 板蓝根颗粒","PC":"http://p1.kfyao.com/60/34/6034140617160400992.jpg","MS":"10gx20袋 含蔗糖","MM":"清热解毒，凉血利咽。用于肺胃热盛所致的咽喉肿痛、口咽干燥；急性扁桃体炎见上述证候者。","PR":"10.60"},{"PID":7614,"TL":"慢严舒柠咽炎片","PC":"http://p1.kfyao.com/67/86/6786160519100541613.jpg","MS":"0.25gx15片x2板（换包装啦，新老包装随机发）","MM":"养阴润肺，清热解毒，清利咽喉，镇咳止痒。用于慢性咽炎引起咽干，咽痒，刺激性咳嗽。","PR":"12.80"},{"PID":469,"TL":"[感康] 感康","PC":"http://p1.kfyao.com/48/22/4822161020174442423.jpg","MS":"12片","MM":"适用于缓解普通感冒及流行性感冒引起的发热、头痛、四肢酸痛、打喷嚏、流鼻涕、鼻塞、咽痛等症状。","PR":"12.80"},{"PID":12361,"TL":"[标婷] 标婷维生素E乳","PC":"http://p1.kfyao.com/71/59/7159161025105344337.jpg","MS":"100g（喷头式）","MM":"用于皮肤干燥并有润肤、保湿作用。","PR":"9.60"},{"PID":3560,"TL":"[扬子江] 蓝芩口服液","PC":"http://p1.kfyao.com/89/19/8919160425093406836.jpg","MS":"10mlX6支","MM":"清热解毒，利咽消肿。用于急性咽炎、肺胃实热证所致的咽痛、咽干、咽部灼热。","PR":"18.00"},{"PID":276,"TL":"[葵花药业] 小儿肺热咳喘口服液","PC":"http://p1.kfyao.com/87/30/8730160414154247818.jpg","MS":"10ml×6支","MM":"清热解毒，宣肺化痰。用于热邪犯于肺卫所致发热、汗出、微恶风寒、咳嗽、痰黄，或兼喘息、口干而渴。","PR":"26.50"},{"PID":3217,"TL":"[云南白药] 蒲地蓝消炎片","PC":"http://p1.kfyao.com/12/89/1289160424144959512.jpg","MS":"0.3克x24片x2板 薄膜衣片","MM":"清热解毒，抗炎消肿。用于疖肿、咽炎、扁桃腺炎。","PR":"12.00"},{"PID":3790,"TL":"[香港京都] 京都念慈菴蜜炼川贝枇杷膏","PC":"http://p1.kfyao.com/82/76/8276140905143541379.jpg","MS":"150ml","MM":"润肺化痰、止咳平喘、护喉利咽、生津补气、调心降火。本品适用于伤风咳嗽、痰稠、痰多气喘、咽喉干痒及声音嘶哑。","PR":"25.60"},{"PID":337,"TL":"[江中] 健胃消食片","PC":"http://p1.kfyao.com/40/27/4027160414152245227.jpg","MS":"0.8gx8片x4板 成人","MM":"健胃消食。用于脾胃虚弱所致的食积，症见不思饮食、嗳腐酸臭、脘腹胀满；消化不良见上述证候者。","PR":"7.60"},{"PID":6032,"TL":"[日本冈本] 冈本避孕套","PC":"http://p1.kfyao.com/50/69/5069160831125209765.jpg","MS":"3只/盒 超润滑","MM":"超润滑冈本避孕套","PR":"12.00"}]}}
         */

        private int ID;
        private MMBeanXXX MM;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public MMBeanXXX getMM() {
            return MM;
        }

        public void setMM(MMBeanXXX MM) {
            this.MM = MM;
        }

        public static class MMBeanXXX {
            /**
             * TJ : {"BARPC":"http://okm.kfyao.com/v3/images/tj/tj02.jpg","BARPC2":"http://okm.kfyao.com/v3/images/tj/top3.jpg","BARURL":"http://okm.kfyao.com/v3/tj.php?tl=特价活动","TJMM":[{"URL":"http://okm.kfyao.com/v3/images/tj/15513.jpg","PID":15513},{"URL":"http://okm.kfyao.com/v3/images/tj/13365_3.jpg","PID":13365},{"URL":"http://okm.kfyao.com/v3/images/tj/7538_3.jpg","PID":7538},{"URL":"http://okm.kfyao.com/v3/images/tj/1961_3.jpg","PID":1961}]}
             * ZT : {"TL":"主题特卖","MM":[{"PC":"http://p1.kfyao.com/66/73/6673161110141432929_1080_460_.jpg","ZID":"10","URL":"http://okm.kfyao.com/v3/ztl.php?tl=双11狂欢购"},{"PC":"http://p1.kfyao.com/41/94/4194161108114303683_1080_460_.jpg","ZID":"2","URL":"http://okm.kfyao.com/v3/ztl.php?tl=雾霾专题"}],"URL":"http://okm.kfyao.com/v3/zt.php?tl=主题特卖"}
             * PP : {"TL":"品牌推荐","MM":[{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=云南白药","PC":"http://okm.kfyao.com/v3/images/pp/2.png","ZID":"2","TL":"云南白药"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=桂龙药业","PC":"http://okm.kfyao.com/v3/images/pp/9.png","ZID":"9","TL":"桂龙药业"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=白云山","PC":"http://okm.kfyao.com/v3/images/pp/4.png","ZID":"4","TL":"白云山"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=华润三九","PC":"http://okm.kfyao.com/v3/images/pp/3.png","ZID":"3","TL":"华润三九"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=杜蕾斯","PC":"http://okm.kfyao.com/v3/images/pp/5.png","ZID":"5","TL":"杜蕾斯"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=九芝堂","PC":"http://okm.kfyao.com/v3/images/pp/6.png","ZID":"6","TL":"九芝堂"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=贵州百灵","PC":"http://okm.kfyao.com/v3/images/pp/7.png","ZID":"7","TL":"贵州百灵"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=哈药集团","PC":"http://okm.kfyao.com/v3/images/pp/8.png","ZID":"8","TL":"哈药集团"}],"URL":"http://okm.kfyao.com/v3/pp.php?tl=品牌推荐"}
             * JJTJ : {"TL":"当季热销商品","PC":"http://okm.kfyao.com/v3/images/jj/jjbj.png","MM":[{"PID":2864,"TL":"[白云山] 板蓝根颗粒","PC":"http://p1.kfyao.com/60/34/6034140617160400992.jpg","MS":"10gx20袋 含蔗糖","MM":"清热解毒，凉血利咽。用于肺胃热盛所致的咽喉肿痛、口咽干燥；急性扁桃体炎见上述证候者。","PR":"10.60"},{"PID":7614,"TL":"慢严舒柠咽炎片","PC":"http://p1.kfyao.com/67/86/6786160519100541613.jpg","MS":"0.25gx15片x2板（换包装啦，新老包装随机发）","MM":"养阴润肺，清热解毒，清利咽喉，镇咳止痒。用于慢性咽炎引起咽干，咽痒，刺激性咳嗽。","PR":"12.80"},{"PID":469,"TL":"[感康] 感康","PC":"http://p1.kfyao.com/48/22/4822161020174442423.jpg","MS":"12片","MM":"适用于缓解普通感冒及流行性感冒引起的发热、头痛、四肢酸痛、打喷嚏、流鼻涕、鼻塞、咽痛等症状。","PR":"12.80"},{"PID":12361,"TL":"[标婷] 标婷维生素E乳","PC":"http://p1.kfyao.com/71/59/7159161025105344337.jpg","MS":"100g（喷头式）","MM":"用于皮肤干燥并有润肤、保湿作用。","PR":"9.60"},{"PID":3560,"TL":"[扬子江] 蓝芩口服液","PC":"http://p1.kfyao.com/89/19/8919160425093406836.jpg","MS":"10mlX6支","MM":"清热解毒，利咽消肿。用于急性咽炎、肺胃实热证所致的咽痛、咽干、咽部灼热。","PR":"18.00"},{"PID":276,"TL":"[葵花药业] 小儿肺热咳喘口服液","PC":"http://p1.kfyao.com/87/30/8730160414154247818.jpg","MS":"10ml×6支","MM":"清热解毒，宣肺化痰。用于热邪犯于肺卫所致发热、汗出、微恶风寒、咳嗽、痰黄，或兼喘息、口干而渴。","PR":"26.50"},{"PID":3217,"TL":"[云南白药] 蒲地蓝消炎片","PC":"http://p1.kfyao.com/12/89/1289160424144959512.jpg","MS":"0.3克x24片x2板 薄膜衣片","MM":"清热解毒，抗炎消肿。用于疖肿、咽炎、扁桃腺炎。","PR":"12.00"},{"PID":3790,"TL":"[香港京都] 京都念慈菴蜜炼川贝枇杷膏","PC":"http://p1.kfyao.com/82/76/8276140905143541379.jpg","MS":"150ml","MM":"润肺化痰、止咳平喘、护喉利咽、生津补气、调心降火。本品适用于伤风咳嗽、痰稠、痰多气喘、咽喉干痒及声音嘶哑。","PR":"25.60"},{"PID":337,"TL":"[江中] 健胃消食片","PC":"http://p1.kfyao.com/40/27/4027160414152245227.jpg","MS":"0.8gx8片x4板 成人","MM":"健胃消食。用于脾胃虚弱所致的食积，症见不思饮食、嗳腐酸臭、脘腹胀满；消化不良见上述证候者。","PR":"7.60"},{"PID":6032,"TL":"[日本冈本] 冈本避孕套","PC":"http://p1.kfyao.com/50/69/5069160831125209765.jpg","MS":"3只/盒 超润滑","MM":"超润滑冈本避孕套","PR":"12.00"}]}
             */

            private TJBean TJ;
            private ZTBean ZT;
            private PPBean PP;
            private JJTJBean JJTJ;

            public TJBean getTJ() {
                return TJ;
            }

            public void setTJ(TJBean TJ) {
                this.TJ = TJ;
            }

            public ZTBean getZT() {
                return ZT;
            }

            public void setZT(ZTBean ZT) {
                this.ZT = ZT;
            }

            public PPBean getPP() {
                return PP;
            }

            public void setPP(PPBean PP) {
                this.PP = PP;
            }

            public JJTJBean getJJTJ() {
                return JJTJ;
            }

            public void setJJTJ(JJTJBean JJTJ) {
                this.JJTJ = JJTJ;
            }

            public static class TJBean {
                /**
                 * BARPC : http://okm.kfyao.com/v3/images/tj/tj02.jpg
                 * BARPC2 : http://okm.kfyao.com/v3/images/tj/top3.jpg
                 * BARURL : http://okm.kfyao.com/v3/tj.php?tl=特价活动
                 * TJMM : [{"URL":"http://okm.kfyao.com/v3/images/tj/15513.jpg","PID":15513},{"URL":"http://okm.kfyao.com/v3/images/tj/13365_3.jpg","PID":13365},{"URL":"http://okm.kfyao.com/v3/images/tj/7538_3.jpg","PID":7538},{"URL":"http://okm.kfyao.com/v3/images/tj/1961_3.jpg","PID":1961}]
                 */

                private String BARPC;
                private String BARPC2;
                private String BARURL;
                private List<TJMMBean> TJMM;

                public String getBARPC() {
                    return BARPC;
                }

                public void setBARPC(String BARPC) {
                    this.BARPC = BARPC;
                }

                public String getBARPC2() {
                    return BARPC2;
                }

                public void setBARPC2(String BARPC2) {
                    this.BARPC2 = BARPC2;
                }

                public String getBARURL() {
                    return BARURL;
                }

                public void setBARURL(String BARURL) {
                    this.BARURL = BARURL;
                }

                public List<TJMMBean> getTJMM() {
                    return TJMM;
                }

                public void setTJMM(List<TJMMBean> TJMM) {
                    this.TJMM = TJMM;
                }

                public static class TJMMBean {
                    /**
                     * URL : http://okm.kfyao.com/v3/images/tj/15513.jpg
                     * PID : 15513
                     */

                    private String URL;
                    private int PID;

                    public String getURL() {
                        return URL;
                    }

                    public void setURL(String URL) {
                        this.URL = URL;
                    }

                    public int getPID() {
                        return PID;
                    }

                    public void setPID(int PID) {
                        this.PID = PID;
                    }
                }
            }

            public static class ZTBean {
                /**
                 * TL : 主题特卖
                 * MM : [{"PC":"http://p1.kfyao.com/66/73/6673161110141432929_1080_460_.jpg","ZID":"10","URL":"http://okm.kfyao.com/v3/ztl.php?tl=双11狂欢购"},{"PC":"http://p1.kfyao.com/41/94/4194161108114303683_1080_460_.jpg","ZID":"2","URL":"http://okm.kfyao.com/v3/ztl.php?tl=雾霾专题"}]
                 * URL : http://okm.kfyao.com/v3/zt.php?tl=主题特卖
                 */

                private String TL;
                private String URL;
                private List<MMBean> MM;

                public String getTL() {
                    return TL;
                }

                public void setTL(String TL) {
                    this.TL = TL;
                }

                public String getURL() {
                    return URL;
                }

                public void setURL(String URL) {
                    this.URL = URL;
                }

                public List<MMBean> getMM() {
                    return MM;
                }

                public void setMM(List<MMBean> MM) {
                    this.MM = MM;
                }

                public static class MMBean {
                    /**
                     * PC : http://p1.kfyao.com/66/73/6673161110141432929_1080_460_.jpg
                     * ZID : 10
                     * URL : http://okm.kfyao.com/v3/ztl.php?tl=双11狂欢购
                     */

                    private String PC;
                    private String ZID;
                    private String URL;

                    public String getPC() {
                        return PC;
                    }

                    public void setPC(String PC) {
                        this.PC = PC;
                    }

                    public String getZID() {
                        return ZID;
                    }

                    public void setZID(String ZID) {
                        this.ZID = ZID;
                    }

                    public String getURL() {
                        return URL;
                    }

                    public void setURL(String URL) {
                        this.URL = URL;
                    }
                }
            }

            public static class PPBean {
                /**
                 * TL : 品牌推荐
                 * MM : [{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=云南白药","PC":"http://okm.kfyao.com/v3/images/pp/2.png","ZID":"2","TL":"云南白药"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=桂龙药业","PC":"http://okm.kfyao.com/v3/images/pp/9.png","ZID":"9","TL":"桂龙药业"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=白云山","PC":"http://okm.kfyao.com/v3/images/pp/4.png","ZID":"4","TL":"白云山"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=华润三九","PC":"http://okm.kfyao.com/v3/images/pp/3.png","ZID":"3","TL":"华润三九"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=杜蕾斯","PC":"http://okm.kfyao.com/v3/images/pp/5.png","ZID":"5","TL":"杜蕾斯"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=九芝堂","PC":"http://okm.kfyao.com/v3/images/pp/6.png","ZID":"6","TL":"九芝堂"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=贵州百灵","PC":"http://okm.kfyao.com/v3/images/pp/7.png","ZID":"7","TL":"贵州百灵"},{"URL":"http://okm.kfyao.com/v3/ppl.php?tl=哈药集团","PC":"http://okm.kfyao.com/v3/images/pp/8.png","ZID":"8","TL":"哈药集团"}]
                 * URL : http://okm.kfyao.com/v3/pp.php?tl=品牌推荐
                 */

                private String TL;
                private String URL;
                private List<MMBeanX> MM;

                public String getTL() {
                    return TL;
                }

                public void setTL(String TL) {
                    this.TL = TL;
                }

                public String getURL() {
                    return URL;
                }

                public void setURL(String URL) {
                    this.URL = URL;
                }

                public List<MMBeanX> getMM() {
                    return MM;
                }

                public void setMM(List<MMBeanX> MM) {
                    this.MM = MM;
                }

                public static class MMBeanX {
                    /**
                     * URL : http://okm.kfyao.com/v3/ppl.php?tl=云南白药
                     * PC : http://okm.kfyao.com/v3/images/pp/2.png
                     * ZID : 2
                     * TL : 云南白药
                     */

                    private String URL;
                    private String PC;
                    private String ZID;
                    private String TL;

                    public String getURL() {
                        return URL;
                    }

                    public void setURL(String URL) {
                        this.URL = URL;
                    }

                    public String getPC() {
                        return PC;
                    }

                    public void setPC(String PC) {
                        this.PC = PC;
                    }

                    public String getZID() {
                        return ZID;
                    }

                    public void setZID(String ZID) {
                        this.ZID = ZID;
                    }

                    public String getTL() {
                        return TL;
                    }

                    public void setTL(String TL) {
                        this.TL = TL;
                    }
                }
            }

            public static class JJTJBean {
                /**
                 * TL : 当季热销商品
                 * PC : http://okm.kfyao.com/v3/images/jj/jjbj.png
                 * MM : [{"PID":2864,"TL":"[白云山] 板蓝根颗粒","PC":"http://p1.kfyao.com/60/34/6034140617160400992.jpg","MS":"10gx20袋 含蔗糖","MM":"清热解毒，凉血利咽。用于肺胃热盛所致的咽喉肿痛、口咽干燥；急性扁桃体炎见上述证候者。","PR":"10.60"},{"PID":7614,"TL":"慢严舒柠咽炎片","PC":"http://p1.kfyao.com/67/86/6786160519100541613.jpg","MS":"0.25gx15片x2板（换包装啦，新老包装随机发）","MM":"养阴润肺，清热解毒，清利咽喉，镇咳止痒。用于慢性咽炎引起咽干，咽痒，刺激性咳嗽。","PR":"12.80"},{"PID":469,"TL":"[感康] 感康","PC":"http://p1.kfyao.com/48/22/4822161020174442423.jpg","MS":"12片","MM":"适用于缓解普通感冒及流行性感冒引起的发热、头痛、四肢酸痛、打喷嚏、流鼻涕、鼻塞、咽痛等症状。","PR":"12.80"},{"PID":12361,"TL":"[标婷] 标婷维生素E乳","PC":"http://p1.kfyao.com/71/59/7159161025105344337.jpg","MS":"100g（喷头式）","MM":"用于皮肤干燥并有润肤、保湿作用。","PR":"9.60"},{"PID":3560,"TL":"[扬子江] 蓝芩口服液","PC":"http://p1.kfyao.com/89/19/8919160425093406836.jpg","MS":"10mlX6支","MM":"清热解毒，利咽消肿。用于急性咽炎、肺胃实热证所致的咽痛、咽干、咽部灼热。","PR":"18.00"},{"PID":276,"TL":"[葵花药业] 小儿肺热咳喘口服液","PC":"http://p1.kfyao.com/87/30/8730160414154247818.jpg","MS":"10ml×6支","MM":"清热解毒，宣肺化痰。用于热邪犯于肺卫所致发热、汗出、微恶风寒、咳嗽、痰黄，或兼喘息、口干而渴。","PR":"26.50"},{"PID":3217,"TL":"[云南白药] 蒲地蓝消炎片","PC":"http://p1.kfyao.com/12/89/1289160424144959512.jpg","MS":"0.3克x24片x2板 薄膜衣片","MM":"清热解毒，抗炎消肿。用于疖肿、咽炎、扁桃腺炎。","PR":"12.00"},{"PID":3790,"TL":"[香港京都] 京都念慈菴蜜炼川贝枇杷膏","PC":"http://p1.kfyao.com/82/76/8276140905143541379.jpg","MS":"150ml","MM":"润肺化痰、止咳平喘、护喉利咽、生津补气、调心降火。本品适用于伤风咳嗽、痰稠、痰多气喘、咽喉干痒及声音嘶哑。","PR":"25.60"},{"PID":337,"TL":"[江中] 健胃消食片","PC":"http://p1.kfyao.com/40/27/4027160414152245227.jpg","MS":"0.8gx8片x4板 成人","MM":"健胃消食。用于脾胃虚弱所致的食积，症见不思饮食、嗳腐酸臭、脘腹胀满；消化不良见上述证候者。","PR":"7.60"},{"PID":6032,"TL":"[日本冈本] 冈本避孕套","PC":"http://p1.kfyao.com/50/69/5069160831125209765.jpg","MS":"3只/盒 超润滑","MM":"超润滑冈本避孕套","PR":"12.00"}]
                 */

                private String TL;
                private String PC;
                private List<MMBeanXX> MM;

                public String getTL() {
                    return TL;
                }

                public void setTL(String TL) {
                    this.TL = TL;
                }

                public String getPC() {
                    return PC;
                }

                public void setPC(String PC) {
                    this.PC = PC;
                }

                public List<MMBeanXX> getMM() {
                    return MM;
                }

                public void setMM(List<MMBeanXX> MM) {
                    this.MM = MM;
                }

                public static class MMBeanXX {
                    /**
                     * PID : 2864
                     * TL : [白云山] 板蓝根颗粒
                     * PC : http://p1.kfyao.com/60/34/6034140617160400992.jpg
                     * MS : 10gx20袋 含蔗糖
                     * MM : 清热解毒，凉血利咽。用于肺胃热盛所致的咽喉肿痛、口咽干燥；急性扁桃体炎见上述证候者。
                     * PR : 10.60
                     */

                    private int PID;
                    private String TL;
                    private String PC;
                    private String MS;
                    private String MM;
                    private String PR;

                    public int getPID() {
                        return PID;
                    }

                    public void setPID(int PID) {
                        this.PID = PID;
                    }

                    public String getTL() {
                        return TL;
                    }

                    public void setTL(String TL) {
                        this.TL = TL;
                    }

                    public String getPC() {
                        return PC;
                    }

                    public void setPC(String PC) {
                        this.PC = PC;
                    }

                    public String getMS() {
                        return MS;
                    }

                    public void setMS(String MS) {
                        this.MS = MS;
                    }

                    public String getMM() {
                        return MM;
                    }

                    public void setMM(String MM) {
                        this.MM = MM;
                    }

                    public String getPR() {
                        return PR;
                    }

                    public void setPR(String PR) {
                        this.PR = PR;
                    }
                }
            }
        }
    }
}
