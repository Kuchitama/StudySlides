(ns L5.functional-lang-study1
	(:use L5 L5.layout)
    (:import [java.awt Color]))

(defcontext
  {:with 640 :height 480
   :font-family "Gill Sans"
   :font-size 30
   :color (Color/white)
   :background-color Color/darkGray})

(defslides
  [(t "今日から始めるClojure")
   (with {:font-size 20
          :position :fixed
          :padding {:top 380}}
         (lines "国平清貴@Kuchitama"
                "関数型言語勉強会#1 2012/05/19"))]
   [(title "About me")
    (item "国平清貴 @kuchitama"
          "フリュー株式会社"
          "Java/AS3/Scala/Clojure"
          "Kyoto.clj")
    (lines
          " "
          " "
          "注：このアイコンは"
          "全裸にはなりません")
    (with-padding {:top 170 :right 0 :bottom 0 :left 330}
      (with {:position :fixed} (img "kuchitama.png")))]
  [(t "Do you know Clojure?")]
 [(title "Clojure怖くない")
   (with-padding {:top 150 :left 80}
      (with {:position :fixed} (img "jigoku.png")))
   (with-padding {:top 320}
      (with {:position :fixed} (lines "clojure？"
          "あー。日本語の方がよっぽど難しいよー。"
          "#地獄のクチタマ")))
   ]
   [(title "Clojure")
   (item "LISP"
         "JVM上で動く"
         "全てがSequence"
         "○関数型 ×オブジェクト指向"
         "基本Immutable"
         "平行性")]
  [(title "言語を学ぶ")
    (item "環境構築"
          "Hello world"
          "書籍"
          "練習")]
  [(title "環境構築")
   "Leiningen"
   (item "ビルドツール"
         "デファクトスタンダード"
         "S式"
         "必要なライブラリを自動解決"
         "プラグインの追加"
         "簡単すぎるインストール")
         "もはや必須"]
  [(title "環境構築")
   (item "Leiningenインストール")
   (lines "$ wget https://raw.github.com/technomancy/"
          "                 leiningen/stable/bin/lein"
          "$ chmod a+x /{YOUR_PATH}/lein"
          "$ lein self-install")]
  [(t "環境構築だん")]
  [(title "Hello world!")
   (item "ちょっと関数型っぽくやってみる")
   (lines "#Clojure REPL 実行"
          "$ lein repl"
          " "
          "(defn hello-clj [names]"
          "  (map #(str \"Hello \" % \"!\") name))"
          " "
          "(hello-clj [\"daiksy\" \"irof\" \"hakurai\"])"
          "=> (\"Hello daiksy!\" \"Hello irof!\" \"Hello hakurai!\")")]
  [(t "簡単でしょ")]
  [(t "もっと" "知りたいですよね")]
  [(title "書籍")
   (item "7つの言語 7つの世界"
         "Clojure Programming"
         "プログラミング言語 Clojure")]
  [(t "あとは"
      "練習あるのみ")]
  [(title "4Clojure")
   (item "Clojure学習サイト"
         "ブラウザで"
         "http://www.4clojure.com/")]
  [(title "Kyoto.clj")
   (item "Clojureの勉強会"
         "#1の内容 http://tech.furyu.jp/blog/?p=1317")
   (item "今後もやっていきたい")]
  [(lines " " 
          "ご清聴ありがとうございました"
          " "
          "ご興味があれば、"
          "次回Kyoto.cljにもご参加ください")
   (with {:font-size 20
          :position :fixed
          :padding {:top 450 :left 280}}
         (lines "This presentation is made by Clojure&L5"))
   ]
)
