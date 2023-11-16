public class Kitap {

    //soru1

    private String ad;
    private String tip;
    private int sayfaSayisi;
    private int suankiSayfa=1;

    public Kitap()
    {

    };
    public Kitap(String ad,int sayfaSayisi)
    {
        this.ad=ad;
        this.sayfaSayisi=sayfaSayisi;
    };

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSuankiSayfa(int suankiSayfa) {
        this.suankiSayfa = suankiSayfa;
    }

    public int getSuankiSayfa() {
        return suankiSayfa;
    }

    public void gitIleri()
    {
        if (this.suankiSayfa+1>this.sayfaSayisi)
        {
            System.out.println("Daha ileriye gidemezsiniz son sayfadasiniz.");
        }
        else
        {
            this.suankiSayfa++;
        }
    }
    public void gitGeri()
    {
        if(this.suankiSayfa-1<1)
        {
            System.out.println("Daha geriye gidemezsiniz ilk sayfadasiniz.");
        }
        else
        {
            this.suankiSayfa--;
        }
    }
    public void gitIleriSayfa(int p)
    {
        if (this.suankiSayfa+p>this.sayfaSayisi)
        {
            System.out.println("Daha ileriye gidemezsiniz. İlerlenebilecek o kadar sayfa kalmadı.");
        }
        else
        {
            this.suankiSayfa+=p;
        }
    }
    public void gitGeriSayfa(int p)
    {
        if(this.suankiSayfa-p<1)
        {
            System.out.println("Daha geriye gidemezsiniz. Geriye gidebilecek o kadar sayfa kalmadı.");
        }
        else
        {
            this.suankiSayfa-=p;
        }
    }
    public void goruntuleBilgi()
    {
        System.out.println("Ad: " +ad);
        System.out.println("Tip: "+tip);
        System.out.println("SayfaSayisi: "+sayfaSayisi);
        System.out.println("SuankiSayfa: "+suankiSayfa);
    }
}
