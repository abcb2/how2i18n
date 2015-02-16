# Javaでのi18n
http://docs.oracle.com/javase/tutorial/i18n/TOC.html

TOCは上記ページを訳出

## TOC
* 導入
  * 手っ取り早い例
    * Before i18n
    * After i18n
    * サンプルプログラム
    * サンプルプログラムのi18n(国際化)
  * チェックリスト
* ロケールの設定
  * ロケールの生成
  * IETF言語タグ(BCP47)
  * 使用可能なロケールの識別
  * 言語タグのフィルタリングとマッチング(lookup)
  * ロケールのスコープ
  * ロケール認識サービスのSPI(Service Provider Interface)
* ロケール特有のデータの分割
  * ResourceBundleクラス
  * ResourceBundleクラス利用の準備
  * PropertiesファイルとResourceBundleの組み合わせ
  * ListResourceBundleの使い方
  * ResourceBundleのロード方法のカスタマイズ
* フォーマット
  * 数字と通貨
    * 定義済みのフォーマットの利用
    * フォーマットのカスタマイズ
  * 日付と時刻
    * 定義済みのフォーマットの利用
    * フォーマットのカスタマイズ
    * 日付に関する略語の変更
  * Messages
    * 複合メッセージの取り扱い
    * 複数形の処理
* テキストの操作